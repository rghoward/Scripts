package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import defpackage.ydb;
import defpackage.z90;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(ydb ydbVar) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.a;
        if (ydbVar.h(1)) {
            i = ydbVar.i();
        }
        iconCompat.a = i;
        byte[] bArrF = iconCompat.c;
        if (ydbVar.h(2)) {
            bArrF = ydbVar.f();
        }
        iconCompat.c = bArrF;
        Parcelable parcelableJ = iconCompat.d;
        if (ydbVar.h(3)) {
            parcelableJ = ydbVar.j();
        }
        iconCompat.d = parcelableJ;
        int i2 = iconCompat.e;
        if (ydbVar.h(4)) {
            i2 = ydbVar.i();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f;
        if (ydbVar.h(5)) {
            i3 = ydbVar.i();
        }
        iconCompat.f = i3;
        Parcelable parcelableJ2 = iconCompat.g;
        if (ydbVar.h(6)) {
            parcelableJ2 = ydbVar.j();
        }
        iconCompat.g = (ColorStateList) parcelableJ2;
        String strK = iconCompat.i;
        if (ydbVar.h(7)) {
            strK = ydbVar.k();
        }
        iconCompat.i = strK;
        String strK2 = iconCompat.j;
        if (ydbVar.h(8)) {
            strK2 = ydbVar.k();
        }
        iconCompat.j = strK2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                z90.a("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr = iconCompat.c;
                iconCompat.b = bArr;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, ydb ydbVar) {
        ydbVar.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            ydbVar.m(1);
            ydbVar.q(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            ydbVar.m(2);
            ydbVar.o(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            ydbVar.m(3);
            ydbVar.r(parcelable);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            ydbVar.m(4);
            ydbVar.q(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            ydbVar.m(5);
            ydbVar.q(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            ydbVar.m(6);
            ydbVar.r(colorStateList);
        }
        String str = iconCompat.i;
        if (str != null) {
            ydbVar.m(7);
            ydbVar.s(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            ydbVar.m(8);
            ydbVar.s(str2);
        }
    }
}
