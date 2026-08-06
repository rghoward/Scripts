package defpackage;

import rv5.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rv5<Interval extends a> {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {

        /* JADX INFO: renamed from: rv5$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0235a implements oh4 {
            public static final C0235a t = new C0235a();

            @Override // defpackage.oh4
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return null;
            }
        }

        default oh4<Integer, Object> d() {
            return C0235a.t;
        }

        default oh4<Integer, Object> getKey() {
            return null;
        }
    }

    public final Object f(int i) {
        lj5 lj5VarB = g().b(i);
        return lj5VarB.c.d().invoke(Integer.valueOf(i - lj5VarB.a));
    }

    public abstract j27 g();

    public final Object h(int i) {
        Object objInvoke;
        lj5 lj5VarB = g().b(i);
        int i2 = i - lj5VarB.a;
        oh4<Integer, Object> key = lj5VarB.c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new yr2(i) : objInvoke;
    }
}
