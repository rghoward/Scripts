package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w78 extends ek4<w78, a> implements cu6 {
    private static final w78 DEFAULT_INSTANCE;
    private static volatile tt7<w78> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private vh6<String, y78> preferences_ = vh6.u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends ek4.a<w78, a> implements cu6 {
        public a() {
            super(w78.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final rh6<String, y78> a = new rh6<>(fob.v, fob.x, y78.A());
    }

    static {
        w78 w78Var = new w78();
        DEFAULT_INSTANCE = w78Var;
        ek4.o(w78.class, w78Var);
    }

    public static vh6 q(w78 w78Var) {
        vh6<String, y78> vh6Var = w78Var.preferences_;
        if (!vh6Var.t) {
            w78Var.preferences_ = vh6Var.c();
        }
        return w78Var.preferences_;
    }

    public static a s() {
        return (a) ((ek4.a) DEFAULT_INSTANCE.h(ek4.f.x));
    }

    public static w78 t(FileInputStream fileInputStream) {
        w78 w78Var = DEFAULT_INSTANCE;
        pg1.b bVar = new pg1.b(fileInputStream);
        ur3 ur3VarA = ur3.a();
        w78 w78VarN = w78Var.n();
        try {
            ye8 ye8Var = ye8.c;
            ye8Var.getClass();
            w49 w49VarA = ye8Var.a(w78VarN.getClass());
            rg1 rg1Var = bVar.d;
            if (rg1Var == null) {
                rg1Var = new rg1(bVar);
            }
            w49VarA.f(w78VarN, rg1Var, ur3VarA);
            w49VarA.b(w78VarN);
            if (ek4.k(w78VarN, true)) {
                return w78VarN;
            }
            throw new fk5(new b2b().getMessage());
        } catch (b2b e) {
            throw new fk5(e.getMessage());
        } catch (fk5 e2) {
            if (e2.t) {
                throw new fk5(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof fk5) {
                throw ((fk5) e3.getCause());
            }
            throw new fk5(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof fk5) {
                throw ((fk5) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // defpackage.ek4
    public final Object h(ek4.f fVar) {
        tt7 bVar;
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new yh8(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.a});
            case 3:
                return new w78();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                tt7<w78> tt7Var = PARSER;
                if (tt7Var != null) {
                    return tt7Var;
                }
                synchronized (w78.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new ek4.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            default:
                e44.b();
                return null;
        }
    }

    public final Map<String, y78> r() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
