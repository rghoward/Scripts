package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zo5 implements ap5 {
    public final xv9 a;
    public bp5 b;
    public d94 c;

    public zo5(xv9 xv9Var) {
        this.a = xv9Var;
    }

    public final bp5 a() {
        bp5 bp5Var = this.b;
        if (bp5Var != null) {
            return bp5Var;
        }
        xj5.e("keyboardActions");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x0048  */
    /* JADX WARN: Code duplicated, block: B:31:0x004c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0052  */
    /* JADX WARN: Code duplicated, block: B:36:0x0056  */
    /* JADX WARN: Code duplicated, block: B:38:0x005a  */
    /* JADX WARN: Code duplicated, block: B:40:0x005e  */
    public final boolean b(int i) {
        oh4<ap5, g2b> oh4Var;
        xv9 xv9Var;
        d94 d94Var;
        d94 d94Var2;
        if (i != 7 && i != 2) {
            if (i == 6) {
                oh4Var = a().a;
            } else if (i == 5) {
                a();
            } else if (i == 3) {
                oh4Var = a().b;
            } else if (i == 4) {
                a();
            } else if (i != 1 && i != 0) {
                aa0.c("invalid ImeAction");
                return false;
            }
            if (oh4Var != null) {
                oh4Var.invoke(this);
                return true;
            }
            if (i == 6) {
                d94Var2 = this.c;
                if (d94Var2 != null) {
                    d94Var2.r(1);
                    return true;
                }
                xj5.e("focusManager");
                throw null;
            }
            if (i == 5) {
                if (i == 7 || (xv9Var = this.a) == null) {
                    return false;
                }
                xv9Var.a();
                return true;
            }
            d94Var = this.c;
            if (d94Var != null) {
                d94Var.r(2);
                return true;
            }
            xj5.e("focusManager");
            throw null;
        }
        a();
        oh4Var = null;
        if (oh4Var != null) {
            oh4Var.invoke(this);
            return true;
        }
        if (i == 6) {
            d94Var2 = this.c;
            if (d94Var2 != null) {
                d94Var2.r(1);
                return true;
            }
            xj5.e("focusManager");
            throw null;
        }
        if (i == 5) {
            if (i == 7) {
            }
            return false;
        }
        d94Var = this.c;
        if (d94Var != null) {
            d94Var.r(2);
            return true;
        }
        xj5.e("focusManager");
        throw null;
    }
}
