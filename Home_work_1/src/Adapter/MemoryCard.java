package Adapter;

public class MemoryCard implements Interface {

    @Override
    public void setConnection() {
        System.out.println("����� ������ ���������!");
    }

    public void readData() {
        System.out.println("������ � ����� ������ �������� ��� ������.");
    }
}
