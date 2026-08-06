package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.intercom.twig.BuildConfig;
import defpackage.ay2;
import defpackage.ci0;
import defpackage.e04;
import defpackage.fg8;
import defpackage.g24;
import defpackage.hr0;
import defpackage.j04;
import defpackage.kh9;
import defpackage.n92;
import defpackage.qp1;
import defpackage.qq1;
import defpackage.r66;
import defpackage.si;
import defpackage.t04;
import defpackage.v24;
import defpackage.x76;
import io.ably.lib.util.AgentHeaderCreator;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final fg8<ExecutorService> a = new fg8<>(ci0.class, ExecutorService.class);
    public final fg8<ExecutorService> b = new fg8<>(hr0.class, ExecutorService.class);
    public final fg8<ExecutorService> c = new fg8<>(x76.class, ExecutorService.class);

    static {
        Map<kh9.a, v24.a> map = v24.b;
        kh9.a aVar = kh9.a.t;
        if (map.containsKey(aVar)) {
            Log.d("FirebaseSessions", "Dependency " + aVar + " already added.");
            return;
        }
        map.put(aVar, new v24.a(new CountDownLatch(1)));
        Log.d("FirebaseSessions", "Dependency to " + aVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<qp1<?>> getComponents() {
        qp1.a aVarB = qp1.b(j04.class);
        aVarB.a = "fire-cls";
        aVarB.a(ay2.c(e04.class));
        aVarB.a(ay2.c(t04.class));
        aVarB.a(new ay2(this.a, 1, 0));
        aVarB.a(new ay2(this.b, 1, 0));
        aVarB.a(new ay2(this.c, 1, 0));
        aVarB.a(new ay2(0, 2, n92.class));
        aVarB.a(new ay2(0, 2, si.class));
        aVarB.a(new ay2(0, 2, g24.class));
        aVarB.f = new qq1() { // from class: s92
            /* JADX WARN: Code duplicated, block: B:100:0x03ed  */
            /* JADX WARN: Code duplicated, block: B:102:0x03f6  */
            /* JADX WARN: Code duplicated, block: B:103:0x03fb  */
            /* JADX WARN: Code duplicated, block: B:124:0x052f  */
            /* JADX WARN: Code duplicated, block: B:126:0x0538  */
            /* JADX WARN: Code duplicated, block: B:130:0x0555  */
            /* JADX WARN: Code duplicated, block: B:139:0x05bb  */
            /* JADX WARN: Code duplicated, block: B:141:0x05d5  */
            /* JADX WARN: Code duplicated, block: B:148:0x039a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:155:0x021f A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:158:0x02e6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:38:0x01e9  */
            /* JADX WARN: Code duplicated, block: B:41:0x01f3  */
            /* JADX WARN: Code duplicated, block: B:43:0x021b  */
            /* JADX WARN: Code duplicated, block: B:49:0x024e  */
            /* JADX WARN: Code duplicated, block: B:52:0x02b2  */
            /* JADX WARN: Code duplicated, block: B:54:0x02ba  */
            /* JADX WARN: Code duplicated, block: B:55:0x02c3  */
            /* JADX WARN: Code duplicated, block: B:59:0x02d1  */
            /* JADX WARN: Code duplicated, block: B:61:0x02d7  */
            /* JADX WARN: Code duplicated, block: B:65:0x02fa A[LOOP:3: B:64:0x02f8->B:65:0x02fa, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:68:0x0318  */
            /* JADX WARN: Code duplicated, block: B:69:0x031f  */
            /* JADX WARN: Code duplicated, block: B:72:0x0324  */
            /* JADX WARN: Code duplicated, block: B:73:0x0326  */
            /* JADX WARN: Code duplicated, block: B:79:0x037d  */
            /* JADX WARN: Code duplicated, block: B:81:0x0385  */
            /* JADX WARN: Code duplicated, block: B:97:0x03e4  */
            /* JADX WARN: Instruction removed from duplicated block: B:139:0x05bb, please report this as an issue */
            /* JADX WARN: Type inference failed for: r11v1, types: [vi] */
            @Override // defpackage.qq1
            public final Object a(xu8 xu8Var) throws Throwable {
                sa2 sa2Var;
                String str;
                int i;
                Throwable th;
                String strA;
                int size;
                int i2;
                j04 j04Var;
                long jCurrentTimeMillis;
                String str2;
                String str3;
                String str4;
                String strD;
                int iD;
                String string;
                String[] strArr;
                ArrayList arrayList;
                int i3;
                StringBuilder sb;
                int size2;
                int i4;
                String string2;
                String strH;
                int i5;
                final xk9 xk9Var;
                AtomicReference<t9a<nk9>> atomicReference;
                AtomicReference<nk9> atomicReference2;
                nk9 nk9VarA;
                se2 se2Var;
                r9a r9aVarO;
                Context context;
                boolean z;
                String str5;
                sa2 sa2Var2;
                boolean zExists;
                NetworkInfo activeNetworkInfo;
                Resources resources;
                nk9 nk9VarA2;
                String str6;
                String string3;
                CrashlyticsRegistrar crashlyticsRegistrar = this.t;
                int i6 = CrashlyticsRegistrar.d;
                sa2.d.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                e04 e04Var = (e04) xu8Var.a(e04.class);
                t04 t04Var = (t04) xu8Var.a(t04.class);
                tv2 tv2VarH = xu8Var.h(n92.class);
                tv2 tv2VarH2 = xu8Var.h(si.class);
                tv2 tv2VarH3 = xu8Var.h(g24.class);
                ExecutorService executorService = (ExecutorService) xu8Var.g(crashlyticsRegistrar.a);
                ExecutorService executorService2 = (ExecutorService) xu8Var.g(crashlyticsRegistrar.b);
                ExecutorService executorService3 = (ExecutorService) xu8Var.g(crashlyticsRegistrar.c);
                e04Var.a();
                Context context2 = e04Var.a;
                String packageName = context2.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.0.6 for " + packageName, null);
                sa2 sa2Var3 = new sa2(executorService, executorService2);
                ey3 ey3Var = new ey3(context2);
                se2 se2Var2 = new se2(e04Var);
                z65 z65Var = new z65(context2, packageName, t04Var, se2Var2);
                q92 q92Var = new q92(tv2VarH);
                final xi xiVar = new xi(tv2VarH2);
                v82 v82Var = new v82(se2Var2, ey3Var);
                v24 v24Var = v24.a;
                kh9.a aVar = kh9.a.t;
                v24 v24Var2 = v24.a;
                v24.a aVarA = v24.a(aVar);
                if (aVarA.b != null) {
                    Log.d("FirebaseSessions", "Subscriber " + aVar + " already registered.");
                } else {
                    aVarA.b = v82Var;
                    Log.d("FirebaseSessions", "Subscriber " + aVar + " registered.");
                    aVarA.a.countDown();
                }
                final l92 l92Var = new l92(e04Var, z65Var, q92Var, se2Var2, new ui(xiVar), new yi() { // from class: vi
                    @Override // defpackage.yi
                    public final void c(Bundle bundle) {
                        xiVar.a.c(bundle);
                    }
                }, ey3Var, v82Var, new um8(tv2VarH3), sa2Var3);
                sa2 sa2Var4 = l92Var.o;
                e04Var.a();
                String str7 = e04Var.c.b;
                int iD2 = po1.d(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (iD2 == 0) {
                    iD2 = po1.d(context2, "com.crashlytics.android.build_id", "string");
                }
                String string4 = iD2 != 0 ? context2.getResources().getString(iD2) : null;
                ArrayList arrayList2 = new ArrayList();
                int iD3 = po1.d(context2, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int iD4 = po1.d(context2, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int iD5 = po1.d(context2, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                try {
                    try {
                        try {
                            if (iD3 == 0 || iD4 == 0 || iD5 == 0) {
                                sa2Var = sa2Var4;
                                str = str7;
                                String str8 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iD3), Integer.valueOf(iD4), Integer.valueOf(iD5));
                                i = 3;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    th = null;
                                    Log.d("FirebaseCrashlytics", str8, null);
                                }
                                strA = ct1.a("Mapping file ID is: ", string4);
                                if (Log.isLoggable("FirebaseCrashlytics", i)) {
                                    Log.d("FirebaseCrashlytics", strA, th);
                                }
                                size = arrayList2.size();
                                i2 = 0;
                                while (i2 < size) {
                                    Object obj = arrayList2.get(i2);
                                    i2++;
                                    ny0 ny0Var = (ny0) obj;
                                    String str9 = ny0Var.a;
                                    String str10 = ny0Var.b;
                                    String str11 = ny0Var.c;
                                    int i7 = size;
                                    StringBuilder sbA = vb0.a("Build id for ", str9, " on ", str10, ": ");
                                    sbA.append(str11);
                                    string3 = sbA.toString();
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", string3, null);
                                    }
                                    size = i7;
                                }
                                String str12 = str;
                                s00 s00VarA = s00.a(context2, z65Var, str12, string4, arrayList2, new wy2(context2));
                                str3 = "Installer package name is: " + s00VarA.d;
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", str3, null);
                                }
                                str4 = s00VarA.f;
                                String str13 = s00VarA.g;
                                strD = z65Var.d();
                                cy3 cy3Var = new cy3();
                                fd7 fd7Var = new fd7(cy3Var);
                                w11 w11Var = new w11(ey3Var);
                                Locale locale = Locale.US;
                                String strC = sk0.c("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str12, "/settings");
                                jt2 jt2Var = new jt2();
                                jt2Var.a = strC;
                                String str14 = Build.MANUFACTURER;
                                String str15 = z65.h;
                                String strA2 = cj2.a(str14.replaceAll(str15, BuildConfig.FLAVOR), AgentHeaderCreator.AGENT_DIVIDER, Build.MODEL.replaceAll(str15, BuildConfig.FLAVOR));
                                String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str15, BuildConfig.FLAVOR);
                                String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str15, BuildConfig.FLAVOR);
                                iD = po1.d(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                                if (iD == 0) {
                                    iD = po1.d(context2, "com.crashlytics.android.build_id", "string");
                                }
                                if (iD != 0) {
                                    string = context2.getResources().getString(iD);
                                } else {
                                    string = null;
                                }
                                strArr = new String[]{string, str12, str13, str4};
                                arrayList = new ArrayList();
                                i3 = 0;
                                while (i3 < 4) {
                                    str6 = strArr[i3];
                                    String[] strArr2 = strArr;
                                    if (str6 != null) {
                                        arrayList.add(str6.replace("-", BuildConfig.FLAVOR).toLowerCase(Locale.US));
                                    }
                                    i3++;
                                    strArr = strArr2;
                                }
                                Collections.sort(arrayList);
                                sb = new StringBuilder();
                                size2 = arrayList.size();
                                i4 = 0;
                                while (i4 < size2) {
                                    Object obj2 = arrayList.get(i4);
                                    i4++;
                                    sb.append((String) obj2);
                                    str4 = str4;
                                }
                                String str16 = str4;
                                string2 = sb.toString();
                                if (string2.length() > 0) {
                                    strH = po1.h(string2);
                                } else {
                                    strH = null;
                                }
                                if (strD != null) {
                                    i5 = 4;
                                } else {
                                    i5 = 1;
                                }
                                xk9Var = new xk9(context2, new al9(str12, strA2, strReplaceAll, strReplaceAll2, z65Var, strH, str13, str16, b3.b(i5)), cy3Var, fd7Var, w11Var, jt2Var, se2Var2);
                                qk9 qk9Var = qk9.t;
                                atomicReference = xk9Var.i;
                                atomicReference2 = xk9Var.h;
                                if (xk9Var.a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", BuildConfig.FLAVOR).equals(xk9Var.b.f) || (nk9VarA2 = xk9Var.a(qk9Var)) == null) {
                                    nk9VarA = xk9Var.a(qk9.v);
                                    if (nk9VarA != null) {
                                        atomicReference2.set(nk9VarA);
                                        atomicReference.get().d(nk9VarA);
                                    }
                                    se2Var = xk9Var.g;
                                    q6d q6dVar = se2Var.f.a;
                                    synchronized (se2Var.b) {
                                        q6d q6dVar2 = se2Var.c.a;
                                    }
                                    r9aVarO = ka2.a(q6dVar, q6dVar2).o(sa2Var3.a, new wk9(xk9Var, sa2Var3));
                                } else {
                                    atomicReference2.set(nk9VarA2);
                                    atomicReference.get().d(nk9VarA2);
                                    r9aVarO = caa.e(null);
                                }
                                r9aVarO.e(executorService3, new i04());
                                ey3 ey3Var2 = l92Var.i;
                                context = l92Var.a;
                                if (context != null || (resources = context.getResources()) == null) {
                                    z = true;
                                } else {
                                    int iD6 = po1.d(context, "com.crashlytics.RequireBuildId", "bool");
                                    if (iD6 > 0) {
                                        z = resources.getBoolean(iD6);
                                    } else {
                                        int iD7 = po1.d(context, "com.crashlytics.RequireBuildId", "string");
                                        if (iD7 > 0) {
                                            z = Boolean.parseBoolean(context.getString(iD7));
                                        } else {
                                            z = true;
                                        }
                                    }
                                }
                                str5 = s00VarA.b;
                                if (z) {
                                    if (TextUtils.isEmpty(str5)) {
                                        Log.e("FirebaseCrashlytics", ".");
                                        Log.e("FirebaseCrashlytics", ".     |  | ");
                                        Log.e("FirebaseCrashlytics", ".     |  |");
                                        Log.e("FirebaseCrashlytics", ".     |  |");
                                        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                                        Log.e("FirebaseCrashlytics", ".    \\    /");
                                        Log.e("FirebaseCrashlytics", ".     \\  /");
                                        Log.e("FirebaseCrashlytics", ".      \\/");
                                        Log.e("FirebaseCrashlytics", ".");
                                        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                        Log.e("FirebaseCrashlytics", ".");
                                        Log.e("FirebaseCrashlytics", ".      /\\");
                                        Log.e("FirebaseCrashlytics", ".     /  \\");
                                        Log.e("FirebaseCrashlytics", ".    /    \\");
                                        Log.e("FirebaseCrashlytics", ".   / |  | \\");
                                        Log.e("FirebaseCrashlytics", ".     |  |");
                                        Log.e("FirebaseCrashlytics", ".     |  |");
                                        Log.e("FirebaseCrashlytics", ".     |  |");
                                        Log.e("FirebaseCrashlytics", ".");
                                        aa0.c("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                        return null;
                                    }
                                } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", null);
                                }
                                final String str17 = new k01().a;
                                l92Var.f = new m92("crash_marker", ey3Var2);
                                l92Var.e = new m92("initialization_marker", ey3Var2);
                                sa2Var2 = sa2Var;
                                u5b u5bVar = new u5b(str17, ey3Var2, sa2Var2);
                                qd6 qd6Var = new qd6(ey3Var2);
                                dv6 dv6Var = new dv6(new as4());
                                um8 um8Var = l92Var.n;
                                um8Var.getClass();
                                final t92 t92Var = new t92(u5bVar);
                                ((wk7) um8Var.a).a(new tv2.a() { // from class: tm8
                                    @Override // tv2.a
                                    public final void a(of8 of8Var) {
                                        ((g24) of8Var.get()).a(t92Var);
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                                        }
                                    }
                                });
                                l92Var.g = new d92(l92Var.a, l92Var.h, l92Var.b, l92Var.i, l92Var.f, s00VarA, u5bVar, qd6Var, hh9.d(l92Var.a, l92Var.h, l92Var.i, s00VarA, qd6Var, u5bVar, dv6Var, xk9Var, l92Var.c, l92Var.l, l92Var.o), l92Var.m, l92Var.k, l92Var.l, l92Var.o);
                                m92 m92Var = l92Var.e;
                                ey3 ey3Var3 = (ey3) m92Var.b;
                                String str18 = (String) m92Var.a;
                                ey3Var3.getClass();
                                zExists = new File(ey3Var3.c, str18).exists();
                                Boolean.TRUE.equals((Boolean) sa2Var2.a.t.submit(new Callable() { // from class: g92
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        d92 d92Var = l92Var.g;
                                        d92Var.getClass();
                                        sa2.a();
                                        m92 m92Var2 = d92Var.c;
                                        ey3 ey3Var4 = (ey3) m92Var2.b;
                                        String str19 = (String) m92Var2.a;
                                        ey3Var4.getClass();
                                        boolean z2 = true;
                                        if (new File(ey3Var4.c, str19).exists()) {
                                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                                Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                                            }
                                            ey3 ey3Var5 = (ey3) m92Var2.b;
                                            ey3Var5.getClass();
                                            new File(ey3Var5.c, str19).delete();
                                        } else {
                                            String strE = d92Var.e();
                                            if (strE == null || !d92Var.j.c(strE)) {
                                                z2 = false;
                                            }
                                        }
                                        return Boolean.valueOf(z2);
                                    }
                                }).get(3L, TimeUnit.SECONDS));
                                final d92 d92Var = l92Var.g;
                                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                                d92Var.e.a.a(new Runnable() { // from class: w82
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        d92Var.c(str17, Boolean.FALSE);
                                    }
                                });
                                la2 la2Var = new la2(new y82(d92Var), xk9Var, defaultUncaughtExceptionHandler, d92Var.j);
                                d92Var.n = la2Var;
                                Thread.setDefaultUncaughtExceptionHandler(la2Var);
                                if (zExists || (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                                    }
                                    sa2Var2.a.a(new Runnable() { // from class: e92
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            l92Var.a(xk9Var);
                                        }
                                    });
                                } else {
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                                    }
                                    l92Var.b(xk9Var);
                                }
                                j04Var = new j04(l92Var);
                                jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                                if (jCurrentTimeMillis > 16) {
                                    str2 = "Initializing Crashlytics blocked main for " + jCurrentTimeMillis + " ms";
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", str2, null);
                                    }
                                }
                                return j04Var;
                            }
                            String[] stringArray = context2.getResources().getStringArray(iD3);
                            String[] stringArray2 = context2.getResources().getStringArray(iD4);
                            String[] stringArray3 = context2.getResources().getStringArray(iD5);
                            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                                int i8 = 0;
                                while (i8 < stringArray3.length) {
                                    int i9 = i8;
                                    arrayList2.add(new ny0(stringArray[i9], stringArray2[i9], stringArray3[i9]));
                                    i8 = i9 + 1;
                                    str7 = str7;
                                    sa2Var4 = sa2Var4;
                                }
                                sa2Var = sa2Var4;
                                str = str7;
                            } else {
                                sa2Var = sa2Var4;
                                str = str7;
                                String str19 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str19, null);
                                }
                            }
                            i = 3;
                            Boolean.TRUE.equals((Boolean) sa2Var2.a.t.submit(new Callable() { // from class: g92
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    d92 d92Var2 = l92Var.g;
                                    d92Var2.getClass();
                                    sa2.a();
                                    m92 m92Var2 = d92Var2.c;
                                    ey3 ey3Var4 = (ey3) m92Var2.b;
                                    String str110 = (String) m92Var2.a;
                                    ey3Var4.getClass();
                                    boolean z2 = true;
                                    if (new File(ey3Var4.c, str110).exists()) {
                                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                            Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                                        }
                                        ey3 ey3Var5 = (ey3) m92Var2.b;
                                        ey3Var5.getClass();
                                        new File(ey3Var5.c, str110).delete();
                                    } else {
                                        String strE = d92Var2.e();
                                        if (strE == null || !d92Var2.j.c(strE)) {
                                            z2 = false;
                                        }
                                    }
                                    return Boolean.valueOf(z2);
                                }
                            }).get(3L, TimeUnit.SECONDS));
                        } catch (Exception unused) {
                        }
                        l92Var.f = new m92("crash_marker", ey3Var2);
                        l92Var.e = new m92("initialization_marker", ey3Var2);
                        sa2Var2 = sa2Var;
                        u5b u5bVar2 = new u5b(str17, ey3Var2, sa2Var2);
                        qd6 qd6Var2 = new qd6(ey3Var2);
                        dv6 dv6Var2 = new dv6(new as4());
                        um8 um8Var2 = l92Var.n;
                        um8Var2.getClass();
                        final t92 t92Var2 = new t92(u5bVar2);
                        ((wk7) um8Var2.a).a(new tv2.a() { // from class: tm8
                            @Override // tv2.a
                            public final void a(of8 of8Var) {
                                ((g24) of8Var.get()).a(t92Var2);
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                                }
                            }
                        });
                        l92Var.g = new d92(l92Var.a, l92Var.h, l92Var.b, l92Var.i, l92Var.f, s00VarA, u5bVar2, qd6Var2, hh9.d(l92Var.a, l92Var.h, l92Var.i, s00VarA, qd6Var2, u5bVar2, dv6Var2, xk9Var, l92Var.c, l92Var.l, l92Var.o), l92Var.m, l92Var.k, l92Var.l, l92Var.o);
                        m92 m92Var2 = l92Var.e;
                        ey3 ey3Var4 = (ey3) m92Var2.b;
                        String str110 = (String) m92Var2.a;
                        ey3Var4.getClass();
                        zExists = new File(ey3Var4.c, str110).exists();
                        final d92 d92Var2 = l92Var.g;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                        d92Var2.e.a.a(new Runnable() { // from class: w82
                            @Override // java.lang.Runnable
                            public final void run() {
                                d92Var2.c(str17, Boolean.FALSE);
                            }
                        });
                        la2 la2Var2 = new la2(new y82(d92Var2), xk9Var, defaultUncaughtExceptionHandler2, d92Var2.j);
                        d92Var2.n = la2Var2;
                        Thread.setDefaultUncaughtExceptionHandler(la2Var2);
                        if (zExists) {
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                            }
                            sa2Var2.a.a(new Runnable() { // from class: e92
                                @Override // java.lang.Runnable
                                public final void run() {
                                    l92Var.a(xk9Var);
                                }
                            });
                        } else {
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                            }
                            sa2Var2.a.a(new Runnable() { // from class: e92
                                @Override // java.lang.Runnable
                                public final void run() {
                                    l92Var.a(xk9Var);
                                }
                            });
                        }
                    } catch (Exception e) {
                        Log.e("FirebaseCrashlytics", "Crashlytics was not started due to an exception during initialization", e);
                        l92Var.g = null;
                    }
                    s00 s00VarA2 = s00.a(context2, z65Var, str12, string4, arrayList2, new wy2(context2));
                    str3 = "Installer package name is: " + s00VarA2.d;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    str4 = s00VarA2.f;
                    String str111 = s00VarA2.g;
                    strD = z65Var.d();
                    cy3 cy3Var2 = new cy3();
                    fd7 fd7Var2 = new fd7(cy3Var2);
                    w11 w11Var2 = new w11(ey3Var);
                    Locale locale2 = Locale.US;
                    String strC2 = sk0.c("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str12, "/settings");
                    jt2 jt2Var2 = new jt2();
                    jt2Var2.a = strC2;
                    String str112 = Build.MANUFACTURER;
                    String str113 = z65.h;
                    String strA3 = cj2.a(str112.replaceAll(str113, BuildConfig.FLAVOR), AgentHeaderCreator.AGENT_DIVIDER, Build.MODEL.replaceAll(str113, BuildConfig.FLAVOR));
                    String strReplaceAll3 = Build.VERSION.INCREMENTAL.replaceAll(str113, BuildConfig.FLAVOR);
                    String strReplaceAll4 = Build.VERSION.RELEASE.replaceAll(str113, BuildConfig.FLAVOR);
                    iD = po1.d(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (iD == 0) {
                        iD = po1.d(context2, "com.crashlytics.android.build_id", "string");
                    }
                    if (iD != 0) {
                        string = context2.getResources().getString(iD);
                    } else {
                        string = null;
                    }
                    strArr = new String[]{string, str12, str111, str4};
                    arrayList = new ArrayList();
                    i3 = 0;
                    while (i3 < 4) {
                        str6 = strArr[i3];
                        String[] strArr3 = strArr;
                        if (str6 != null) {
                            arrayList.add(str6.replace("-", BuildConfig.FLAVOR).toLowerCase(Locale.US));
                        }
                        i3++;
                        strArr = strArr3;
                    }
                    Collections.sort(arrayList);
                    sb = new StringBuilder();
                    size2 = arrayList.size();
                    i4 = 0;
                    while (i4 < size2) {
                        Object obj3 = arrayList.get(i4);
                        i4++;
                        sb.append((String) obj3);
                        str4 = str4;
                    }
                    String str114 = str4;
                    string2 = sb.toString();
                    if (string2.length() > 0) {
                        strH = po1.h(string2);
                    } else {
                        strH = null;
                    }
                    if (strD != null) {
                        i5 = 4;
                    } else {
                        i5 = 1;
                    }
                    xk9Var = new xk9(context2, new al9(str12, strA3, strReplaceAll3, strReplaceAll4, z65Var, strH, str111, str114, b3.b(i5)), cy3Var2, fd7Var2, w11Var2, jt2Var2, se2Var2);
                    qk9 qk9Var2 = qk9.t;
                    atomicReference = xk9Var.i;
                    atomicReference2 = xk9Var.h;
                    if (xk9Var.a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", BuildConfig.FLAVOR).equals(xk9Var.b.f)) {
                        nk9VarA = xk9Var.a(qk9.v);
                        if (nk9VarA != null) {
                            atomicReference2.set(nk9VarA);
                            atomicReference.get().d(nk9VarA);
                        }
                        se2Var = xk9Var.g;
                        q6d q6dVar3 = se2Var.f.a;
                        synchronized (se2Var.b) {
                            q6d q6dVar4 = se2Var.c.a;
                            r9aVarO = ka2.a(q6dVar3, q6dVar4).o(sa2Var3.a, new wk9(xk9Var, sa2Var3));
                        }
                    } else {
                        nk9VarA = xk9Var.a(qk9.v);
                        if (nk9VarA != null) {
                            atomicReference2.set(nk9VarA);
                            atomicReference.get().d(nk9VarA);
                        }
                        se2Var = xk9Var.g;
                        q6d q6dVar5 = se2Var.f.a;
                        synchronized (se2Var.b) {
                            q6d q6dVar6 = se2Var.c.a;
                            r9aVarO = ka2.a(q6dVar5, q6dVar6).o(sa2Var3.a, new wk9(xk9Var, sa2Var3));
                        }
                    }
                    r9aVarO.e(executorService3, new i04());
                    ey3 ey3Var5 = l92Var.i;
                    context = l92Var.a;
                    if (context != null) {
                        z = true;
                    } else {
                        z = true;
                    }
                    str5 = s00VarA2.b;
                    if (z) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", null);
                        }
                    } else if (TextUtils.isEmpty(str5)) {
                        Log.e("FirebaseCrashlytics", ".");
                        Log.e("FirebaseCrashlytics", ".     |  | ");
                        Log.e("FirebaseCrashlytics", ".     |  |");
                        Log.e("FirebaseCrashlytics", ".     |  |");
                        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                        Log.e("FirebaseCrashlytics", ".    \\    /");
                        Log.e("FirebaseCrashlytics", ".     \\  /");
                        Log.e("FirebaseCrashlytics", ".      \\/");
                        Log.e("FirebaseCrashlytics", ".");
                        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        Log.e("FirebaseCrashlytics", ".");
                        Log.e("FirebaseCrashlytics", ".      /\\");
                        Log.e("FirebaseCrashlytics", ".     /  \\");
                        Log.e("FirebaseCrashlytics", ".    /    \\");
                        Log.e("FirebaseCrashlytics", ".   / |  | \\");
                        Log.e("FirebaseCrashlytics", ".     |  |");
                        Log.e("FirebaseCrashlytics", ".     |  |");
                        Log.e("FirebaseCrashlytics", ".     |  |");
                        Log.e("FirebaseCrashlytics", ".");
                        aa0.c("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        return null;
                    }
                    final String str115 = new k01().a;
                    j04Var = new j04(l92Var);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e2);
                    j04Var = null;
                }
                th = null;
                strA = ct1.a("Mapping file ID is: ", string4);
                if (Log.isLoggable("FirebaseCrashlytics", i)) {
                    Log.d("FirebaseCrashlytics", strA, th);
                }
                size = arrayList2.size();
                i2 = 0;
                while (i2 < size) {
                    Object obj4 = arrayList2.get(i2);
                    i2++;
                    ny0 ny0Var2 = (ny0) obj4;
                    String str20 = ny0Var2.a;
                    String str116 = ny0Var2.b;
                    String str117 = ny0Var2.c;
                    int i10 = size;
                    StringBuilder sbA2 = vb0.a("Build id for ", str20, " on ", str116, ": ");
                    sbA2.append(str117);
                    string3 = sbA2.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", string3, null);
                    }
                    size = i10;
                }
                String str118 = str;
                jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                if (jCurrentTimeMillis > 16) {
                    str2 = "Initializing Crashlytics blocked main for " + jCurrentTimeMillis + " ms";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                }
                return j04Var;
            }
        };
        aVarB.c(2);
        return Arrays.asList(aVarB.b(), r66.a("fire-cls", "20.0.6"));
    }
}
