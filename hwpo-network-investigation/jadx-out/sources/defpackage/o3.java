package defpackage;

import io.intercom.android.sdk.models.AttributeType;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o3 {
    public Object a;
    public Object b;

    public o3(int i) {
        switch (i) {
            case 2:
                this.a = new a47();
                this.b = cp1.a();
                break;
            default:
                this.b = new int[2];
                break;
        }
    }

    public abstract Object a(u02 u02Var);

    public abstract int[] b(int i);

    public int[] c(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String d() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        xj5.e(AttributeType.TEXT);
        throw null;
    }

    public abstract int[] e(int i);

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object f(u02 u02Var) throws Throwable {
        zy8 zy8Var;
        x37 x37Var;
        Throwable th;
        x37 x37Var2;
        bp1 bp1Var = (bp1) this.b;
        if (u02Var instanceof zy8) {
            zy8Var = (zy8) u02Var;
            int i = zy8Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                zy8Var.w = i - Integer.MIN_VALUE;
            } else {
                zy8Var = new zy8(this, u02Var);
            }
        } else {
            zy8Var = new zy8(this, u02Var);
        }
        Object obj = zy8Var.u;
        int i2 = zy8Var.w;
        Object obj2 = v72.t;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                if (bp1Var.a0()) {
                    return g2b.a;
                }
                x37Var = (a47) this.a;
                zy8Var.t = x37Var;
                zy8Var.w = 1;
                if (x37Var.b(zy8Var) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x37Var2 = zy8Var.t;
                try {
                    dv8.b(obj);
                    g2b g2bVar = g2b.a;
                    bp1Var.h0(g2bVar);
                    x37Var2.c(null);
                    return g2bVar;
                } catch (Throwable th2) {
                    th = th2;
                    x37Var2.c(null);
                    throw th;
                }
            }
            x37 x37Var3 = zy8Var.t;
            dv8.b(obj);
            x37Var = x37Var3;
            if (bp1Var.a0()) {
                g2b g2bVar2 = g2b.a;
                x37Var.c(null);
                return g2bVar2;
            }
            zy8Var.t = x37Var;
            zy8Var.w = 2;
            if (a(zy8Var) != obj2) {
                x37Var2 = x37Var;
                g2b g2bVar3 = g2b.a;
                bp1Var.h0(g2bVar3);
                x37Var2.c(null);
                return g2bVar3;
            }
            return obj2;
        } catch (Throwable th3) {
            x37 x37Var4 = x37Var;
            th = th3;
            x37Var2 = x37Var4;
            x37Var2.c(null);
            throw th;
        }
    }
}
