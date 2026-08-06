package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r49 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a {
        public abstract long a();

        public abstract Set<b> b();

        public abstract long c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final b t;
        public static final b u;
        public static final b v;
        public static final /* synthetic */ b[] w;

        static {
            b bVar = new b("NETWORK_UNMETERED", 0);
            t = bVar;
            b bVar2 = new b("DEVICE_IDLE", 1);
            u = bVar2;
            b bVar3 = new b("DEVICE_CHARGING", 2);
            v = bVar3;
            w = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) w.clone();
        }
    }

    public abstract uf1 a();

    public final long b(o98 o98Var, long j, int i) {
        long time = j - a().getTime();
        a aVar = c().get(o98Var);
        long jA = aVar.a();
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * jA * Math.max(1.0d, Math.log(10000.0d) / Math.log((jA > 1 ? jA : 2L) * ((long) i2)))), time), aVar.c());
    }

    public abstract Map<o98, a> c();
}
