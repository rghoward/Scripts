package defpackage;

import java.util.List;
import org.slf4j.ILoggerFactory;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class d47 implements ILoggerFactory, jac {
    public static final /* synthetic */ d47 t = new d47();

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(l6c.u.get().b());
    }

    @Override // org.slf4j.ILoggerFactory
    public yd6 b(String str) {
        return c47.t;
    }
}
