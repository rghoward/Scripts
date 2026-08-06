package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rf1 {
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final of1 a(iw iwVar) {
        List list = iwVar.v;
        hf3 hf3Var = hf3.t;
        List list2 = list == null ? hf3Var : list;
        CharSequence charSequence = iwVar.u;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            jt2 jt2Var = new jt2();
            jt2Var.a = Parcel.obtain();
            if (list == null) {
                list = hf3Var;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                iw.c cVar = (iw.c) list.get(i);
                ww9 ww9Var = (ww9) cVar.a;
                int i2 = cVar.b;
                int i3 = cVar.c;
                ((Parcel) jt2Var.a).recycle();
                jt2Var.a = Parcel.obtain();
                mha mhaVar = ww9Var.a;
                long j = ww9Var.l;
                long j2 = ww9Var.h;
                int i4 = i;
                long j3 = ww9Var.b;
                List list3 = list;
                int i5 = size;
                long jC = mhaVar.c();
                long j4 = uh1.k;
                if (!uh1.c(jC, j4)) {
                    jt2Var.b((byte) 1);
                    ((Parcel) jt2Var.a).writeLong(ww9Var.a.c());
                }
                long j5 = bka.c;
                byte b = 2;
                if (!bka.a(j3, j5)) {
                    jt2Var.b((byte) 2);
                    jt2Var.d(j3);
                }
                ob4 ob4Var = ww9Var.c;
                if (ob4Var != null) {
                    jt2Var.b((byte) 3);
                    ((Parcel) jt2Var.a).writeInt(ob4Var.t);
                }
                mb4 mb4Var = ww9Var.d;
                if (mb4Var != null) {
                    int i6 = mb4Var.a;
                    jt2Var.b((byte) 4);
                    jt2Var.b((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                }
                nb4 nb4Var = ww9Var.e;
                if (nb4Var != null) {
                    int i7 = nb4Var.a;
                    jt2Var.b((byte) 5);
                    if (i7 == 0) {
                        b = 0;
                    } else if (i7 == 65535) {
                        b = 1;
                    } else if (i7 != 1) {
                        if (i7 == 2) {
                            b = 3;
                        } else {
                            b = 0;
                        }
                    }
                    jt2Var.b(b);
                }
                String str = ww9Var.g;
                if (str != null) {
                    jt2Var.b((byte) 6);
                    ((Parcel) jt2Var.a).writeString(str);
                }
                if (!bka.a(j2, j5)) {
                    jt2Var.b((byte) 7);
                    jt2Var.d(j2);
                }
                gl0 gl0Var = ww9Var.i;
                if (gl0Var != null) {
                    float f = gl0Var.a;
                    jt2Var.b((byte) 8);
                    jt2Var.c(f);
                }
                oha ohaVar = ww9Var.j;
                if (ohaVar != null) {
                    jt2Var.b((byte) 9);
                    jt2Var.c(ohaVar.a);
                    jt2Var.c(ohaVar.b);
                }
                if (!uh1.c(j, j4)) {
                    jt2Var.b((byte) 10);
                    ((Parcel) jt2Var.a).writeLong(j);
                }
                fda fdaVar = ww9Var.m;
                if (fdaVar != null) {
                    jt2Var.b((byte) 11);
                    ((Parcel) jt2Var.a).writeInt(fdaVar.a);
                }
                el9 el9Var = ww9Var.n;
                if (el9Var != null) {
                    jt2Var.b((byte) 12);
                    ((Parcel) jt2Var.a).writeLong(el9Var.a);
                    long j6 = el9Var.b;
                    jt2Var.c(Float.intBitsToFloat((int) (j6 >> 32)));
                    jt2Var.c(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    jt2Var.c(el9Var.c);
                }
                SpannableString spannableString2 = spannableString;
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) jt2Var.a).marshall(), 0)), i2, i3, 33);
                i = i4 + 1;
                spannableString = spannableString2;
                list = list3;
                size = i5;
            }
            charSequence = spannableString;
        }
        return new of1(ClipData.newPlainText("plain text", charSequence));
    }
}
