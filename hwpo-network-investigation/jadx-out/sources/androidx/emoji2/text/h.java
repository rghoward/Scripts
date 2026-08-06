package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import defpackage.b78;
import defpackage.uza;
import defpackage.yu6;
import defpackage.zu6;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final zu6 a;
    public final char[] b;
    public final a c = new a(1024);
    public final Typeface d;

    public h(Typeface typeface, zu6 zu6Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = zu6Var;
        int iA = zu6Var.a(6);
        if (iA != 0) {
            int i5 = iA + zu6Var.a;
            i = zu6Var.b.getInt(zu6Var.b.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = zu6Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + zu6Var.a;
            i2 = zu6Var.b.getInt(zu6Var.b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            uza uzaVar = new uza(this, i7);
            yu6 yu6VarB = uzaVar.b();
            int iA3 = yu6VarB.a(4);
            Character.toChars(iA3 != 0 ? yu6VarB.b.getInt(iA3 + yu6VarB.a) : 0, this.b, i7 * 2);
            yu6 yu6VarB2 = uzaVar.b();
            int iA4 = yu6VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + yu6VarB2.a;
                i3 = yu6VarB2.b.getInt(yu6VarB2.b.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            b78.b("invalid metadata codepoint length", i3 > 0);
            a aVar = this.c;
            yu6 yu6VarB3 = uzaVar.b();
            int iA5 = yu6VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + yu6VarB3.a;
                i4 = yu6VarB3.b.getInt(yu6VarB3.b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            aVar.a(uzaVar, 0, i4 - 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public final SparseArray<a> a;
        public uza b;

        public a(int i) {
            this.a = new SparseArray<>(i);
        }

        public final void a(uza uzaVar, int i, int i2) {
            int iA = uzaVar.a(i);
            SparseArray<a> sparseArray = this.a;
            a aVar = sparseArray == null ? null : sparseArray.get(iA);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(uzaVar.a(i), aVar);
            }
            if (i2 > i) {
                aVar.a(uzaVar, i + 1, i2);
            } else {
                aVar.b = uzaVar;
            }
        }

        public a() {
            this(1);
        }
    }
}
