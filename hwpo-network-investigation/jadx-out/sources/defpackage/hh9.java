package defpackage;

import android.content.Context;
import android.util.Log;
import io8.a;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hh9 {
    public final w92 a;
    public final fa2 b;
    public final sg2 c;
    public final qd6 d;
    public final u5b e;
    public final z65 f;
    public final sa2 g;

    public hh9(w92 w92Var, fa2 fa2Var, sg2 sg2Var, qd6 qd6Var, u5b u5bVar, z65 z65Var, sa2 sa2Var) {
        this.a = w92Var;
        this.b = fa2Var;
        this.c = sg2Var;
        this.d = qd6Var;
        this.e = u5bVar;
        this.f = z65Var;
        this.g = sa2Var;
    }

    public static jd0 a(jd0 jd0Var, qd6 qd6Var, u5b u5bVar, Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Map mapUnmodifiableMap3;
        u92.e.d.a.b bVar;
        jd0.a aVarG = jd0Var.g();
        String strB = qd6Var.b.b();
        if (strB != null) {
            aVarG.e = new td0(strB);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean zIsEmpty = map.isEmpty();
        u5b.a aVar = u5bVar.d;
        if (zIsEmpty) {
            kp5 reference = aVar.a.getReference();
            synchronized (reference) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(reference.a));
            }
        } else {
            kp5 reference2 = aVar.a.getReference();
            synchronized (reference2) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference2.a));
            }
            HashMap map2 = new HashMap(mapUnmodifiableMap);
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strA = kp5.a(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strA)) {
                    map2.put(strA, kp5.a(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        }
        List<u92.c> listE = e(mapUnmodifiableMap2);
        kp5 reference3 = u5bVar.e.a.getReference();
        synchronized (reference3) {
            mapUnmodifiableMap3 = Collections.unmodifiableMap(new HashMap(reference3.a));
        }
        List<u92.c> listE2 = e(mapUnmodifiableMap3);
        if (!listE.isEmpty() || !listE2.isEmpty()) {
            kd0.a aVarH = jd0Var.c.h();
            aVarH.b = listE;
            aVarH.c = listE2;
            if (aVarH.h != 1 || (bVar = aVarH.a) == null) {
                StringBuilder sb = new StringBuilder();
                if (aVarH.a == null) {
                    sb.append(" execution");
                }
                if ((aVarH.h & 1) == 0) {
                    sb.append(" uiOrientation");
                }
                aa0.c(v92.a("Missing required properties:", sb));
                return null;
            }
            aVarG.c = new kd0(bVar, listE, listE2, aVarH.d, aVarH.e, aVarH.f, aVarH.g);
        }
        return aVarG.a();
    }

    public static u92.e.d b(jd0 jd0Var, u5b u5bVar) {
        List<gx8> listA = u5bVar.f.a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listA.size(); i++) {
            gx8 gx8Var = listA.get(i);
            ud0.a aVar = new ud0.a();
            String strE = gx8Var.e();
            if (strE == null) {
                ac4.c("Null variantId");
                return null;
            }
            String strC = gx8Var.c();
            if (strC == null) {
                ac4.c("Null rolloutId");
                return null;
            }
            aVar.a = new vd0(strC, strE);
            String strA = gx8Var.a();
            if (strA == null) {
                ac4.c("Null parameterKey");
                return null;
            }
            aVar.b = strA;
            String strB = gx8Var.b();
            if (strB == null) {
                ac4.c("Null parameterValue");
                return null;
            }
            aVar.c = strB;
            aVar.d = gx8Var.d();
            aVar.e = (byte) (aVar.e | 1);
            arrayList.add(aVar.a());
        }
        if (arrayList.isEmpty()) {
            return jd0Var;
        }
        jd0.a aVarG = jd0Var.g();
        aVarG.f = new wd0(arrayList);
        return aVarG.a();
    }

    public static String c(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            bufferedInputStream.close();
            throw th4;
        }
    }

    public static hh9 d(Context context, z65 z65Var, ey3 ey3Var, s00 s00Var, qd6 qd6Var, u5b u5bVar, dv6 dv6Var, xk9 xk9Var, jh7 jh7Var, v82 v82Var, sa2 sa2Var) {
        w92 w92Var = new w92(context, z65Var, s00Var, dv6Var, xk9Var);
        fa2 fa2Var = new fa2(ey3Var, xk9Var, v82Var);
        aa2 aa2Var = sg2.b;
        pxa.b(context);
        return new hh9(w92Var, fa2Var, new sg2(new io8(pxa.a().c(new j01(sg2.c, sg2.d)).a("FIREBASE_CRASHLYTICS_REPORT", new ag3("json"), sg2.e), xk9Var.b(), jh7Var)), qd6Var, u5bVar, z65Var, sa2Var);
    }

    public static List<u92.c> e(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                ac4.c("Null key");
                return null;
            }
            String value = entry.getValue();
            if (value == null) {
                ac4.c("Null value");
                return null;
            }
            arrayList.add(new cd0(key, value));
        }
        Collections.sort(arrayList, new gh9());
        return Collections.unmodifiableList(arrayList);
    }

    public final void f(Throwable th, Thread thread, String str, final wm3 wm3Var, boolean z) {
        final boolean zEquals = str.equals("crash");
        long j = wm3Var.b;
        w92 w92Var = this.a;
        Context context = w92Var.a;
        int i = context.getResources().getConfiguration().orientation;
        dv6 dv6Var = w92Var.d;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        eya eyaVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            eyaVar = new eya(th2.getLocalizedMessage(), th2.getClass().getName(), dv6Var.a(th2.getStackTrace()), eyaVar);
        }
        jd0.a aVar = new jd0.a();
        aVar.b = str;
        aVar.a = j;
        aVar.g = (byte) (aVar.g | 1);
        u92.e.d.a.c cVarB = ea8.a.b(context);
        Boolean boolValueOf = cVarB.a() > 0 ? Boolean.valueOf(cVarB.a() != 100) : null;
        ArrayList arrayListA = ea8.a(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = eyaVar.c;
        String name = thread.getName();
        if (name == null) {
            ac4.c("Null name");
            return;
        }
        List listD = w92.d(stackTraceElementArr, 4);
        if (listD == null) {
            ac4.c("Null frames");
            return;
        }
        arrayList.add(new pd0(4, name, listD));
        if (z) {
            for (Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                Thread key = next.getKey();
                if (!key.equals(thread)) {
                    StackTraceElement[] stackTraceElementArrA = dv6Var.a(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        ac4.c("Null name");
                        return;
                    }
                    List listD2 = w92.d(stackTraceElementArrA, 0);
                    if (listD2 == null) {
                        ac4.c("Null frames");
                        return;
                    }
                    arrayList.add(new pd0(0, name2, listD2));
                }
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        nd0 nd0VarC = w92.c(eyaVar, 0);
        od0 od0VarE = w92.e();
        List<u92.e.d.a.b.AbstractC0258a> listA = w92Var.a();
        if (listA == null) {
            ac4.c("Null binaries");
            return;
        }
        aVar.c = new kd0(new ld0(listUnmodifiableList, nd0VarC, null, od0VarE, listA), null, null, boolValueOf, cVarB, arrayListA, i);
        aVar.d = w92Var.b(i);
        jd0 jd0VarA = aVar.a();
        Map<String, String> map = wm3Var.c;
        qd6 qd6Var = this.d;
        u5b u5bVar = this.e;
        final u92.e.d dVarB = b(a(jd0VarA, qd6Var, u5bVar, map), u5bVar);
        if (z) {
            this.b.d(dVarB, wm3Var.a, zEquals);
        } else {
            this.g.b.a(new Runnable() { // from class: eh9
                @Override // java.lang.Runnable
                public final void run() {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                    }
                    this.t.b.d(dVarB, wm3Var.a, zEquals);
                }
            });
        }
    }

    public final q6d g(String str, Executor executor) {
        t9a<ga2> t9aVar;
        ArrayList arrayListB = this.b.b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            File file = (File) arrayListB.get(i);
            try {
                aa2 aa2Var = fa2.g;
                String strE = fa2.e(file);
                aa2Var.getClass();
                arrayList.add(new zc0(aa2.i(strE), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            ga2 zc0Var = (ga2) obj;
            if (str == null || str.equals(zc0Var.c())) {
                sg2 sg2Var = this.c;
                if (zc0Var.a().f() == null || zc0Var.a().e() == null) {
                    m04 m04VarB = this.f.b(true);
                    u92 u92VarA = zc0Var.a();
                    String str2 = m04VarB.a;
                    yc0.a aVarM = u92VarA.m();
                    aVarM.e = str2;
                    yc0 yc0VarA = aVarM.a();
                    String str3 = m04VarB.b;
                    yc0.a aVarM2 = yc0VarA.m();
                    aVarM2.f = str3;
                    zc0Var = new zc0(aVarM2.a(), zc0Var.c(), zc0Var.b());
                }
                boolean z = str != null;
                io8 io8Var = sg2Var.a;
                synchronized (io8Var.f) {
                    try {
                        t9aVar = new t9a<>();
                        if (z) {
                            io8Var.i.a.getAndIncrement();
                            if (io8Var.f.size() < io8Var.e) {
                                zd6 zd6Var = zd6.t;
                                zd6Var.c("Enqueueing report: " + zc0Var.c());
                                zd6Var.c("Queue size: " + io8Var.f.size());
                                io8Var.g.execute(io8Var.new a(zc0Var, t9aVar));
                                zd6Var.c("Closing task for report: " + zc0Var.c());
                                t9aVar.d(zc0Var);
                            } else {
                                io8Var.a();
                                String str4 = "Dropping report due to queue being full: " + zc0Var.c();
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                io8Var.i.b.getAndIncrement();
                                t9aVar.d(zc0Var);
                            }
                        } else {
                            io8Var.b(zc0Var, t9aVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                arrayList2.add(t9aVar.a.g(executor, new fh9()));
            }
        }
        return caa.f(arrayList2);
    }
}
