package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uq1 {
    public final List<ug5> a;
    public final List<js7<hi6<? extends Object, ? extends Object>, Class<? extends Object>>> b;
    public final List<js7<fp5<? extends Object>, Class<? extends Object>>> c;
    public final List<js7<lu3.a<? extends Object>, Class<? extends Object>>> d;
    public final List<jn2.a> e;

    /* JADX WARN: Multi-variable type inference failed */
    public uq1(List<? extends ug5> list, List<? extends js7<? extends hi6<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends js7<? extends fp5<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends js7<? extends lu3.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends jn2.a> list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public uq1() {
        hf3 hf3Var = hf3.t;
        this(hf3Var, hf3Var, hf3Var, hf3Var, hf3Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final ArrayList a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;

        public a(uq1 uq1Var) {
            this.a = th1.U(uq1Var.a);
            this.b = th1.U(uq1Var.b);
            this.c = th1.U(uq1Var.c);
            this.d = th1.U(uq1Var.d);
            this.e = th1.U(uq1Var.e);
        }

        public final void a(lu3.a aVar, Class cls) {
            this.d.add(new js7(aVar, cls));
        }

        public final void b(hi6 hi6Var, Class cls) {
            this.b.add(new js7(hi6Var, cls));
        }

        public final uq1 c() {
            return new uq1(e.a(this.a), e.a(this.b), e.a(this.c), e.a(this.d), e.a(this.e));
        }

        public a() {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }
    }
}
