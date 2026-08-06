package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sz8 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            int length = str.length();
            StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(iDataPosition);
            sb.append(" size=");
            sb.append(iDataSize);
            super(sb.toString());
        }
    }

    public static Bundle a(Parcel parcel, int i) {
        int iN = n(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iN);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i) {
        int iN = n(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iN);
        return bArrCreateByteArray;
    }

    public static byte[][] c(Parcel parcel, int i) {
        int iN = n(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iN);
        return bArr;
    }

    public static int[] d(Parcel parcel, int i) {
        int iN = n(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iN);
        return iArrCreateIntArray;
    }

    public static <T extends Parcelable> T e(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iN = n(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iN);
        return tCreateFromParcel;
    }

    public static String f(Parcel parcel, int i) {
        int iN = n(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iN);
        return string;
    }

    public static <T> T[] g(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iN = n(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iN);
        return tArr;
    }

    public static <T> ArrayList<T> h(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int iN = n(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iN);
        return arrayListCreateTypedArrayList;
    }

    public static void i(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new a(d43.a(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static boolean j(Parcel parcel, int i) {
        q(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder k(Parcel parcel, int i) {
        int iN = n(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iN == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iN);
        return strongBinder;
    }

    public static int l(Parcel parcel, int i) {
        q(parcel, i, 4);
        return parcel.readInt();
    }

    public static long m(Parcel parcel, int i) {
        q(parcel, i, 8);
        return parcel.readLong();
    }

    public static int n(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void o(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + n(parcel, i));
    }

    public static int p(Parcel parcel) {
        int i = parcel.readInt();
        int iN = n(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iN + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new a(sb.toString(), parcel);
    }

    public static void q(Parcel parcel, int i, int i2) {
        int iN = n(parcel, i);
        if (iN == i2) {
            return;
        }
        String hexString = Integer.toHexString(iN);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iN).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iN);
        throw new a(w27.a(sb, " (0x", hexString, ")"), parcel);
    }

    public static void r(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new a(w27.a(sb, " (0x", hexString, ")"), parcel);
    }
}
