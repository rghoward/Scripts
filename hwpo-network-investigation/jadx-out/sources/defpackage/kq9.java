package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kq9 {
    public final b a = new b(this);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends CancellationException {
        public final kq9 t;

        public a(kq9 kq9Var) {
            super("Cancelled isolated runner");
            this.t = kq9Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final kq9 a;
        public final a47 b = new a47();
        public el5 c;

        public b(kq9 kq9Var) {
            this.a = kq9Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(el5 el5Var, u02 u02Var) {
            lq9 lq9Var;
            a47 a47Var;
            if (u02Var instanceof lq9) {
                lq9Var = (lq9) u02Var;
                int i = lq9Var.x;
                if ((i & Integer.MIN_VALUE) != 0) {
                    lq9Var.x = i - Integer.MIN_VALUE;
                } else {
                    lq9Var = new lq9(this, u02Var);
                }
            } else {
                lq9Var = new lq9(this, u02Var);
            }
            Object obj = lq9Var.v;
            int i2 = lq9Var.x;
            if (i2 == 0) {
                dv8.b(obj);
                lq9Var.t = el5Var;
                a47Var = this.b;
                lq9Var.u = a47Var;
                lq9Var.x = 1;
                Object objB = a47Var.b(lq9Var);
                v72 v72Var = v72.t;
                if (objB == v72Var) {
                    return v72Var;
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a47 a47Var2 = lq9Var.u;
                el5 el5Var2 = lq9Var.t;
                dv8.b(obj);
                a47Var = a47Var2;
                el5Var = el5Var2;
            }
            try {
                if (el5Var == this.c) {
                    this.c = null;
                }
                g2b g2bVar = g2b.a;
                return g2b.a;
            } finally {
                a47Var.c(null);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [el5] */
        /* JADX WARN: Type inference failed for: r1v4, types: [el5] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r9v0, types: [el5] */
        /* JADX WARN: Type inference failed for: r9v1, types: [x37] */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v3, types: [x37] */
        /* JADX WARN: Type inference failed for: r9v4, types: [x37] */
        /* JADX WARN: Type inference failed for: r9v5 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        public final Object b(el5 el5Var, u02 u02Var) {
            mq9 mq9Var;
            ?? r1;
            ?? r0;
            if (u02Var instanceof mq9) {
                mq9Var = (mq9) u02Var;
                int i = mq9Var.x;
                if ((i & Integer.MIN_VALUE) != 0) {
                    mq9Var.x = i - Integer.MIN_VALUE;
                } else {
                    mq9Var = new mq9(this, u02Var);
                }
            } else {
                mq9Var = new mq9(this, u02Var);
            }
            Object obj = mq9Var.v;
            int i2 = mq9Var.x;
            v72 v72Var = v72.t;
            try {
                if (i2 == 0) {
                    dv8.b(obj);
                    mq9Var.t = el5Var;
                    a47 a47Var = this.b;
                    mq9Var.u = a47Var;
                    mq9Var.x = 1;
                    if (a47Var.b(mq9Var) != v72Var) {
                        r1 = el5Var;
                        el5Var = a47Var;
                    }
                    return v72Var;
                }
                if (i2 == 1) {
                    x37 x37Var = mq9Var.u;
                    el5 el5Var2 = mq9Var.t;
                    dv8.b(obj);
                    r1 = el5Var2;
                    el5Var = x37Var;
                } else {
                    if (i2 != 2) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x37 x37Var2 = mq9Var.u;
                    el5 el5Var3 = mq9Var.t;
                    dv8.b(obj);
                    r0 = el5Var3;
                    el5Var = x37Var2;
                }
                r1 = r0;
                this.c = r1;
                el5Var.c(null);
                return true;
                el5 el5Var4 = this.c;
                if (el5Var4 != null) {
                    el5Var4.h();
                }
                if (el5Var4 != null) {
                    el5Var4.k(new a(this.a));
                }
                if (el5Var4 != null) {
                    mq9Var.t = r1;
                    mq9Var.u = el5Var;
                    mq9Var.x = 2;
                    if (el5Var4.p0(mq9Var) != v72Var) {
                        r0 = r1;
                        el5Var = el5Var;
                        r1 = r0;
                    }
                    return v72Var;
                }
                this.c = r1;
                el5Var.c(null);
                return true;
            } catch (Throwable th) {
                el5Var.c(null);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kq9] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final Object a(wr7 wr7Var, u02 u02Var) throws Throwable {
        nq9 nq9Var;
        if (u02Var instanceof nq9) {
            nq9Var = (nq9) u02Var;
            int i = nq9Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                nq9Var.v = i - Integer.MIN_VALUE;
            } else {
                nq9Var = new nq9(this, u02Var);
            }
        } else {
            nq9Var = new nq9(this, u02Var);
        }
        Object obj = nq9Var.t;
        int i2 = nq9Var.v;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                oq9 oq9Var = new oq9(this, wr7Var, null);
                nq9Var.v = 1;
                Object objD = u72.d(oq9Var, nq9Var);
                v72 v72Var = v72.t;
                this = objD;
                if (objD == v72Var) {
                    return v72Var;
                }
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
                this = this;
            }
        } catch (a e) {
            if (e.t != this) {
                throw e;
            }
        }
        return g2b.a;
    }
}
