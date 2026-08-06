package defpackage;

import defpackage.z1;
import z1.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z1<MessageType extends z1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements au6 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a<MessageType extends z1<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements cu6, Cloneable {
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public int f(w49 w49Var) {
        int iE = e();
        if (iE != -1) {
            return iE;
        }
        int iH = w49Var.h(this);
        g(iH);
        return iH;
    }

    public void g(int i) {
        throw new UnsupportedOperationException();
    }
}
