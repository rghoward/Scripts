package defpackage;

import io.ably.lib.http.HttpConstants;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fd4 extends qp8 {
    public static final wq6 c;
    public final List<String> a;
    public final List<String> b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
    }

    static {
        ol8 ol8Var = wq6.e;
        c = wq6.a.a(HttpConstants.ContentTypes.FORM_ENCODING);
    }

    public fd4(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.a = ytb.k(arrayList);
        this.b = ytb.k(arrayList2);
    }

    public final long a(fy0 fy0Var, boolean z) throws EOFException {
        tx0 tx0VarJ;
        if (z) {
            tx0VarJ = new tx0();
        } else {
            fy0Var.getClass();
            tx0VarJ = fy0Var.j();
        }
        List<String> list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                tx0VarJ.Z(38);
            }
            tx0VarJ.g0(list.get(i));
            tx0VarJ.Z(61);
            tx0VarJ.g0(this.b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = tx0VarJ.u;
        tx0VarJ.h();
        return j;
    }

    @Override // defpackage.qp8
    public final long contentLength() {
        return a(null, true);
    }

    @Override // defpackage.qp8
    public final wq6 contentType() {
        return c;
    }

    @Override // defpackage.qp8
    public final void writeTo(fy0 fy0Var) throws EOFException {
        fy0Var.getClass();
        a(fy0Var, false);
    }
}
