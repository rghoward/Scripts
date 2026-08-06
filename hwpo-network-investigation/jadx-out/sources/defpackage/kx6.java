package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface kx6<Model, Data> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<Data> {
        public final ko5 a;
        public final List<ko5> b;
        public final xe2<Data> c;

        public a() {
            throw null;
        }

        public a(ko5 ko5Var, xe2<Data> xe2Var) {
            List<ko5> list = Collections.EMPTY_LIST;
            ov9.d(ko5Var, "Argument must not be null");
            this.a = ko5Var;
            ov9.d(list, "Argument must not be null");
            this.b = list;
            ov9.d(xe2Var, "Argument must not be null");
            this.c = xe2Var;
        }
    }

    a<Data> a(Model model, int i, int i2, xk7 xk7Var);

    boolean b(Model model);
}
