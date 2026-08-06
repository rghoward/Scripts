package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ft2 implements q49 {
    public static final Logger f = Logger.getLogger(pxa.class.getName());
    public final vob a;
    public final Executor b;
    public final ai0 c;
    public final an3 d;
    public final n7a e;

    public ft2(Executor executor, ai0 ai0Var, vob vobVar, an3 an3Var, n7a n7aVar) {
        this.b = executor;
        this.c = ai0Var;
        this.a = vobVar;
        this.d = an3Var;
        this.e = n7aVar;
    }

    @Override // defpackage.q49
    public final void a(final ef0 ef0Var, final be0 be0Var, final rxa rxaVar) {
        this.b.execute(new Runnable() { // from class: ct2
            @Override // java.lang.Runnable
            public final void run() {
                final ft2 ft2Var = this.t;
                final ef0 ef0Var2 = ef0Var;
                String str = ef0Var2.a;
                rxa rxaVar2 = rxaVar;
                be0 be0Var2 = be0Var;
                Logger logger = ft2.f;
                try {
                    dxa dxaVar = ft2Var.c.get(str);
                    if (dxaVar != null) {
                        final be0 be0VarB = dxaVar.b(be0Var2);
                        ft2Var.e.m(new n7a.a() { // from class: dt2
                            @Override // n7a.a
                            public final Object execute() {
                                mm3 mm3Var = be0VarB;
                                ft2 ft2Var2 = ft2Var;
                                an3 an3Var = ft2Var2.d;
                                ef0 ef0Var3 = ef0Var2;
                                an3Var.w(ef0Var3, mm3Var);
                                ft2Var2.a.a(ef0Var3, 1);
                                return null;
                            }
                        });
                        rxaVar2.a(null);
                    } else {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        rxaVar2.a(new IllegalArgumentException(str2));
                    }
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    rxaVar2.a(e);
                }
            }
        });
    }
}
