package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tl implements qf1 {
    public final Context a;
    public ClipboardManager b;

    public tl(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qf1
    public final void a(iw iwVar) {
        ClipboardManager clipboardManagerB = b();
        List list = iwVar.v;
        List list2 = hf3.t;
        if (list == null) {
            list = list2;
        }
        CharSequence charSequence = iwVar.u;
        if (!list.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            tf3 tf3Var = new tf3();
            tf3Var.a = Parcel.obtain();
            ArrayList arrayList = iwVar.v;
            if (arrayList != null) {
                list2 = arrayList;
            }
            int size = list2.size();
            int i = 0;
            while (i < size) {
                iw.c cVar = (iw.c) list2.get(i);
                ww9 ww9Var = (ww9) cVar.a;
                int i2 = cVar.b;
                int i3 = cVar.c;
                tf3Var.a.recycle();
                tf3Var.a = Parcel.obtain();
                mha mhaVar = ww9Var.a;
                long j = ww9Var.l;
                long j2 = ww9Var.h;
                int i4 = i;
                long j3 = ww9Var.b;
                int i5 = size;
                ClipboardManager clipboardManager = clipboardManagerB;
                long jC = mhaVar.c();
                SpannableString spannableString2 = spannableString;
                List list3 = list2;
                long j4 = uh1.k;
                if (!uh1.c(jC, j4)) {
                    tf3Var.a((byte) 1);
                    tf3Var.d(ww9Var.a.c());
                }
                long j5 = bka.c;
                byte b = 2;
                if (!bka.a(j3, j5)) {
                    tf3Var.a((byte) 2);
                    tf3Var.c(j3);
                }
                ob4 ob4Var = ww9Var.c;
                if (ob4Var != null) {
                    tf3Var.a((byte) 3);
                    tf3Var.a.writeInt(ob4Var.t);
                }
                mb4 mb4Var = ww9Var.d;
                if (mb4Var != null) {
                    int i6 = mb4Var.a;
                    tf3Var.a((byte) 4);
                    tf3Var.a((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                }
                nb4 nb4Var = ww9Var.e;
                if (nb4Var != null) {
                    int i7 = nb4Var.a;
                    tf3Var.a((byte) 5);
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
                    tf3Var.a(b);
                }
                String str = ww9Var.g;
                if (str != null) {
                    tf3Var.a((byte) 6);
                    tf3Var.a.writeString(str);
                }
                if (!bka.a(j2, j5)) {
                    tf3Var.a((byte) 7);
                    tf3Var.c(j2);
                }
                gl0 gl0Var = ww9Var.i;
                if (gl0Var != null) {
                    float f = gl0Var.a;
                    tf3Var.a((byte) 8);
                    tf3Var.b(f);
                }
                oha ohaVar = ww9Var.j;
                if (ohaVar != null) {
                    tf3Var.a((byte) 9);
                    tf3Var.b(ohaVar.a);
                    tf3Var.b(ohaVar.b);
                }
                if (!uh1.c(j, j4)) {
                    tf3Var.a((byte) 10);
                    tf3Var.d(j);
                }
                fda fdaVar = ww9Var.m;
                if (fdaVar != null) {
                    tf3Var.a((byte) 11);
                    tf3Var.a.writeInt(fdaVar.a);
                }
                el9 el9Var = ww9Var.n;
                if (el9Var != null) {
                    tf3Var.a((byte) 12);
                    tf3Var.d(el9Var.a);
                    long j6 = el9Var.b;
                    tf3Var.b(Float.intBitsToFloat((int) (j6 >> 32)));
                    tf3Var.b(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    tf3Var.b(el9Var.c);
                }
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(tf3Var.a.marshall(), 0)), i2, i3, 33);
                i = i4 + 1;
                spannableString = spannableString2;
                clipboardManagerB = clipboardManager;
                size = i5;
                list2 = list3;
            }
            charSequence = spannableString;
        }
        clipboardManagerB.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }

    public final ClipboardManager b() {
        ClipboardManager clipboardManager = this.b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.a.getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.b = clipboardManager2;
        return clipboardManager2;
    }
}
