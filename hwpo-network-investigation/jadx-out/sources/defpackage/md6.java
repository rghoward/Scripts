package defpackage;

import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class md6 implements jac {
    public static final Object t = new Object();
    public static final gi1 u = gi1.H;
    public static final /* synthetic */ md6 v = new md6();

    public static String b(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (t) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbB = tn2.b(str, "\n  ");
        sbB.append(strReplace.replace("\n", "\n  "));
        sbB.append('\n');
        return sbB.toString();
    }

    public static void c(String str, String str2) {
        synchronized (t) {
            Log.d(str, b(str2, null));
        }
    }

    public static void d(String str, String str2) {
        synchronized (t) {
            Log.e(str, b(str2, null));
        }
    }

    public static void e(String str, String str2, Throwable th) {
        synchronized (t) {
            Log.e(str, b(str2, th));
        }
    }

    public static void f(String str, String str2) {
        synchronized (t) {
            Log.i(str, b(str2, null));
        }
    }

    public static void g(String str, String str2) {
        synchronized (t) {
            Log.w(str, b(str2, null));
        }
    }

    public static void h(String str, String str2, Throwable th) {
        synchronized (t) {
            Log.w(str, b(str2, th));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object i(u02 u02Var) {
        Object obj;
        h72 context = u02Var.getContext();
        sd.d(context);
        r02 r02VarE = th0.e(u02Var);
        a23 a23Var = r02VarE instanceof a23 ? (a23) r02VarE : null;
        v72 v72Var = v72.t;
        if (a23Var == null) {
            obj = g2b.a;
        } else {
            n72 n72Var = a23Var.w;
            if (b23.g(n72Var, context)) {
                a23Var.y = g2b.a;
                a23Var.v = 1;
                n72Var.u0(context, a23Var);
            } else {
                qrb qrbVar = new qrb();
                h72 h72VarC0 = context.c0(qrbVar);
                g2b g2bVar = g2b.a;
                a23Var.y = g2bVar;
                a23Var.v = 1;
                n72Var.u0(h72VarC0, a23Var);
                if (qrbVar.u) {
                    pm3 pm3VarA = dla.a();
                    h30<d23<?>> h30Var = pm3VarA.x;
                    if (!(h30Var != null ? h30Var.isEmpty() : true)) {
                        if (pm3VarA.v >= 4294967296L) {
                            a23Var.y = g2bVar;
                            a23Var.v = 1;
                            pm3VarA.y0(a23Var);
                        } else {
                            pm3VarA.z0(true);
                            try {
                                a23Var.run();
                                do {
                                } while (pm3VarA.B0());
                            } catch (Throwable th) {
                                try {
                                    a23Var.g(th);
                                } catch (Throwable th2) {
                                    pm3VarA.x0(true);
                                    throw th2;
                                }
                            }
                            pm3VarA.x0(true);
                        }
                    }
                    obj = g2b.a;
                }
            }
            obj = v72Var;
        }
        return obj == v72Var ? obj : g2b.a;
    }

    public static void j(i7d i7dVar) {
        if (i7dVar.a() == Thread.currentThread() && i7dVar.b() != null) {
            j(i7dVar.b());
            l(i7dVar);
        } else {
            Trace.beginSection(i7dVar.d());
            l(i7dVar);
        }
    }

    public static void k(i7d i7dVar) {
        if (i7dVar.a() == Thread.currentThread() && i7dVar.b() != null) {
            Trace.endSection();
            k(i7dVar.b());
        } else {
            Trace.endSection();
            Trace.endSection();
        }
    }

    public static void l(i7d i7dVar) {
        String strE = i7dVar.e();
        AtomicReference atomicReference = m6d.a;
        if (strE.length() > 127) {
            strE = strE.substring(0, 127);
        }
        Trace.beginSection(strE);
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().F());
    }
}
