package defpackage;

import android.content.Context;
import android.os.UserManager;
import android.util.Base64OutputStream;
import com.intercom.twig.BuildConfig;
import io.ably.lib.transport.Defaults;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lr2 implements tu4, uu4 {
    public final ts5 a;
    public final Context b;
    public final of8<k5b> c;
    public final Set<ru4> d;
    public final Executor e;

    public lr2() {
        throw null;
    }

    public lr2(final Context context, final String str, Set<ru4> set, of8<k5b> of8Var, Executor executor) {
        this.a = new ts5(new of8() { // from class: kr2
            @Override // defpackage.of8
            public final Object get() {
                return new xu4(context, str);
            }
        });
        this.d = set;
        this.e = executor;
        this.c = of8Var;
        this.b = context;
    }

    @Override // defpackage.tu4
    public final q6d a() {
        if (!((UserManager) this.b.getSystemService(UserManager.class)).isUserUnlocked()) {
            return caa.e(BuildConfig.FLAVOR);
        }
        return caa.c(this.e, new Callable() { // from class: ir2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                lr2 lr2Var = this.a;
                synchronized (lr2Var) {
                    try {
                        xu4 xu4Var = (xu4) lr2Var.a.get();
                        ArrayList arrayListA = xu4Var.a();
                        synchronized (xu4Var) {
                            xu4Var.a.a(new xj2(1, xu4Var));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListA.size(); i++) {
                            yu4 yu4Var = (yu4) arrayListA.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(Defaults.ABLY_AGENT_PARAM, yu4Var.b());
                            jSONObject.put("dates", new JSONArray((Collection) yu4Var.a()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            }
        });
    }

    @Override // defpackage.uu4
    public final synchronized int b() {
        boolean zE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        xu4 xu4Var = (xu4) this.a.get();
        synchronized (xu4Var) {
            zE = xu4Var.e(xu4.b, jCurrentTimeMillis);
        }
        int i = 1;
        if (!zE) {
            return 1;
        }
        synchronized (xu4Var) {
            xu4Var.a.a(new zj1(i, xu4Var, xu4Var.b(System.currentTimeMillis())));
        }
        return 3;
    }

    public final void c() {
        if (this.d.size() <= 0) {
            caa.e(null);
        } else if (!((UserManager) this.b.getSystemService(UserManager.class)).isUserUnlocked()) {
            caa.e(null);
        } else {
            caa.c(this.e, new Callable() { // from class: hr2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    lr2 lr2Var = this.a;
                    synchronized (lr2Var) {
                        final xu4 xu4Var = (xu4) lr2Var.a.get();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        final String strA = lr2Var.c.get().a();
                        synchronized (xu4Var) {
                            final String strB = xu4Var.b(jCurrentTimeMillis);
                            strA.getClass();
                            final t78.a aVar = new t78.a(strA);
                            xu4Var.a.a(new oh4() { // from class: vu4
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
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    Object obj2;
                                    xu4 xu4Var2 = xu4Var;
                                    String str = strB;
                                    String str2 = strA;
                                    t78.a<?> aVar2 = aVar;
                                    x27 x27Var = (x27) obj;
                                    Object obj3 = null;
                                    if (((String) bl5.a(x27Var, xu4.d, BuildConfig.FLAVOR)).equals(str)) {
                                        t78.a<Set<String>> aVarC = xu4Var2.c(x27Var, str);
                                        if (aVarC == null || aVarC.a.equals(str2)) {
                                            return null;
                                        }
                                        synchronized (xu4Var2) {
                                            xu4Var2.d(x27Var, str);
                                            HashSet hashSet = new HashSet((Collection) bl5.a(x27Var, aVar2, new HashSet()));
                                            hashSet.add(str);
                                            x27Var.h(aVar2, hashSet);
                                        }
                                        return null;
                                    }
                                    t78.a<Long> aVar3 = xu4.c;
                                    long jLongValue = ((Long) bl5.a(x27Var, aVar3, 0L)).longValue();
                                    if (jLongValue + 1 == 30) {
                                        synchronized (xu4Var2) {
                                            try {
                                                long jLongValue2 = ((Long) bl5.a(x27Var, aVar3, 0L)).longValue();
                                                String str3 = BuildConfig.FLAVOR;
                                                Set hashSet2 = new HashSet();
                                                String str4 = null;
                                                for (Map.Entry<t78.a<?>, Object> entry : x27Var.a().entrySet()) {
                                                    if (entry.getValue() instanceof Set) {
                                                        Set<String> set = (Set) entry.getValue();
                                                        for (String str5 : set) {
                                                            Object obj4 = obj3;
                                                            if (str4 == null || str4.compareTo(str5) > 0) {
                                                                str3 = entry.getKey().a;
                                                                str4 = str5;
                                                                hashSet2 = set;
                                                            }
                                                            obj3 = obj4;
                                                        }
                                                    }
                                                    obj3 = obj3;
                                                }
                                                obj2 = obj3;
                                                HashSet hashSet3 = new HashSet(hashSet2);
                                                hashSet3.remove(str4);
                                                str3.getClass();
                                                x27Var.h(new t78.a<>(str3), hashSet3);
                                                jLongValue = jLongValue2 - 1;
                                                x27Var.g(xu4.c, Long.valueOf(jLongValue));
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                    HashSet hashSet4 = new HashSet((Collection) bl5.a(x27Var, aVar2, new HashSet()));
                                    hashSet4.add(str);
                                    x27Var.h(aVar2, hashSet4);
                                    x27Var.g(xu4.c, Long.valueOf(jLongValue + 1));
                                    x27Var.g(xu4.d, str);
                                    return obj2;
                                }
                            });
                        }
                    }
                    return null;
                }
            });
        }
    }
}
