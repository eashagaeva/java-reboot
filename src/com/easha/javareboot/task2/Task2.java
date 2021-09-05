package com.easha.javareboot.task2;

import com.easha.javareboot.task2.domain.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Основной класс приложения
 */
public class Task2 {

    public static final String SIMPLE_FLAG = "-simple";

    public static void main(String[] args) {
        boolean simple = false;
        for (String arg : args) {
            if (SIMPLE_FLAG.equals(arg)) {
                simple = true;
                break;
            }
        }

        Letter letter = new Letter("1");
        letter.setTitle("Письмо");
        EmploymentOrder employmentOrder = new EmploymentOrder("2", "Шагаева Е.А.");
        employmentOrder.setTitle("Приказ о приеме на работу");
        DismissalOrder dismissalOrder = new DismissalOrder("3", "Шагаева Е.А.");
        dismissalOrder.setTitle("Приказ об увольнении");

        List<Document> documentList = new ArrayList<>();
        documentList.add(letter);
        documentList.add(employmentOrder);
        documentList.add(dismissalOrder);

        printDocumentList(documentList, simple);

        for (Document document : documentList) {
            if (document instanceof EmployeeDocument) {
                ((EmployeeDocument) document).setStatus(DocumentStatus.EXECUTED);
            }
        }

        printDocumentList(documentList, simple);
    }

    private static void printDocumentList(List<Document> documentList, boolean simple) {
        for (Document document : documentList) {
            if (simple) {
                System.out.println(document.getMainInfo());
            } else {
                System.out.println(document.toString());
            }
        }
    }
}
