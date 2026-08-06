package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bs2 implements g76 {
    public final as2 t;
    public final g76 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s66.a.values().length];
            try {
                iArr[s66.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s66.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s66.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s66.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s66.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s66.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s66.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public bs2(as2 as2Var, g76 g76Var) {
        as2Var.getClass();
        this.t = as2Var;
        this.u = g76Var;
    }

    @Override // defpackage.g76
    public final void t(m76 m76Var, s66.a aVar) {
        int i = a.a[aVar.ordinal()];
        as2 as2Var = this.t;
        switch (i) {
            case 1:
                as2Var.H(m76Var);
                break;
            case 2:
                as2Var.onStart(m76Var);
                break;
            case 3:
                as2Var.E(m76Var);
                break;
            case 4:
                as2Var.u(m76Var);
                break;
            case 5:
                as2Var.onStop(m76Var);
                break;
            case 6:
                as2Var.onDestroy(m76Var);
                break;
            case 7:
                z90.a("ON_ANY must not been send by anybody");
                return;
            default:
                u.b();
                return;
        }
        g76 g76Var = this.u;
        if (g76Var != null) {
            g76Var.t(m76Var, aVar);
        }
    }
}
