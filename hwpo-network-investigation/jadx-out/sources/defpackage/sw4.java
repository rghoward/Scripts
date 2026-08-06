package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sw4 implements thb.c {
    public static final a d = new a();
    public final vs5 a;
    public final thb.c b;
    public final uw4 c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements lb2.b<oh4<Object, mhb>> {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b {
        vs5 a();

        vl8 b();
    }

    public sw4(vs5 vs5Var, thb.c cVar, ie2 ie2Var) {
        this.a = vs5Var;
        this.b = cVar;
        this.c = new uw4(ie2Var);
    }

    @Override // thb.c
    public final <T extends mhb> T create(Class<T> cls, lb2 lb2Var) {
        return this.a.containsKey(cls) ? (T) this.c.create(cls, lb2Var) : (T) this.b.create(cls, lb2Var);
    }

    @Override // thb.c
    public final <T extends mhb> T create(Class<T> cls) {
        if (!this.a.containsKey(cls)) {
            return (T) this.b.create(cls);
        }
        this.c.create(cls);
        throw null;
    }
}
