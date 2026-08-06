package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import io.ably.lib.util.Crypto;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ms3 {
    public static void a(String str, boolean z) throws ut7 {
        if (!z) {
            throw ut7.a(null, str);
        }
    }

    public static int b(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case h4c.e /* 15 */:
                        return 8000;
                    case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static void c(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iM = m(parcel, i);
        parcel.writeBundle(bundle);
        n(parcel, iM);
    }

    public static void d(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iM = m(parcel, i);
        parcel.writeByteArray(bArr);
        n(parcel, iM);
    }

    public static void e(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iM = m(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        n(parcel, iM);
    }

    public static void f(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iM = m(parcel, i);
        parcel.writeStrongBinder(iBinder);
        n(parcel, iM);
    }

    public static void g(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iM = m(parcel, i);
        parcel.writeIntArray(iArr);
        n(parcel, iM);
    }

    public static void h(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iM = m(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        n(parcel, iM);
    }

    public static void i(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iM = m(parcel, i);
        parcel.writeString(str);
        n(parcel, iM);
    }

    public static void j(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iM = m(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        n(parcel, iM);
    }

    public static void k(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iM = m(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        n(parcel, iM);
    }

    public static void l(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static int m(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void n(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }
}
