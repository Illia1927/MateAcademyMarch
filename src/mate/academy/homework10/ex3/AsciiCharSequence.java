package mate.academy.homework10.ex3;

public class AsciiCharSequence implements CharSequence {
    private byte[] arrayBytes;

    public AsciiCharSequence(byte[] arrayBytes) {
        this.arrayBytes = arrayBytes;
    }

    @Override
    public int length() {
        return arrayBytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) arrayBytes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] arr = new byte[start - end];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrayBytes[start++];

        }
        return new AsciiCharSequence(arr);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arrayBytes.length; i++) {
            stringBuilder.append((char) arrayBytes[i]);
        }
        return stringBuilder.toString();
    }
}
