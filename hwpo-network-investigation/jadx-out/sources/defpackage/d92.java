package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import com.intercom.twig.BuildConfig;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d92 {
    public static final x82 r = new x82();
    public static final Charset s = Charset.forName("UTF-8");
    public final Context a;
    public final se2 b;
    public final m92 c;
    public final u5b d;
    public final sa2 e;
    public final z65 f;
    public final ey3 g;
    public final s00 h;
    public final qd6 i;
    public final n92 j;
    public final yi k;
    public final v82 l;
    public final hh9 m;
    public la2 n;
    public final t9a<Boolean> o = new t9a<>();
    public final t9a<Boolean> p = new t9a<>();
    public final t9a<Void> q = new t9a<>();

    public d92(Context context, z65 z65Var, se2 se2Var, ey3 ey3Var, m92 m92Var, s00 s00Var, u5b u5bVar, qd6 qd6Var, hh9 hh9Var, n92 n92Var, yi yiVar, v82 v82Var, sa2 sa2Var) {
        new AtomicBoolean(false);
        this.a = context;
        this.f = z65Var;
        this.b = se2Var;
        this.g = ey3Var;
        this.c = m92Var;
        this.h = s00Var;
        this.d = u5bVar;
        this.i = qd6Var;
        this.j = n92Var;
        this.k = yiVar;
        this.l = v82Var;
        this.m = hh9Var;
        this.e = sa2Var;
    }

    public static q6d a(d92 d92Var) {
        q6d q6dVarC;
        d92Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : ey3.e(d92Var.g.c.listFiles(r))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    q6dVarC = caa.e(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    q6dVarC = caa.c(new ScheduledThreadPoolExecutor(1), new c92(d92Var, j));
                }
                arrayList.add(q6dVarC);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return caa.f(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:179:0x055c  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x011d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [v82] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22, types: [int] */
    /* JADX WARN: Type inference failed for: r9v24 */
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
    public final void b(boolean z, xk9 xk9Var, boolean z2) throws Throwable {
        hh9 hh9Var;
        int i;
        boolean z3;
        int i2;
        int i3;
        ?? r11;
        boolean z4;
        String str;
        String strSubstring;
        boolean z5;
        String[] list;
        Object obj;
        List<gx8> listB;
        ApplicationExitInfo next;
        String strC;
        List<u92.a.AbstractC0255a> listUnmodifiableList;
        Closeable closeable;
        FileInputStream fileInputStream;
        n92 n92Var = this.j;
        sa2.a();
        hh9 hh9Var2 = this.m;
        ArrayList arrayList = new ArrayList(hh9Var2.b.c());
        if (arrayList.size() <= z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str2 = (String) arrayList.get(z == true ? 1 : 0);
        if (z2 && xk9Var.b().b.b) {
            ey3 ey3Var = this.g;
            int i4 = Build.VERSION.SDK_INT;
            i2 = 4;
            if (i4 >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    qd6 qd6Var = new qd6(ey3Var);
                    i3 = 8;
                    qd6Var.b = qd6.c;
                    if (str2 != null) {
                        qd6Var.b = new rg8(ey3Var.b(str2, "userlog"));
                    }
                    sa2 sa2Var = this.e;
                    ru6 ru6Var = new ru6(ey3Var);
                    u5b u5bVar = new u5b(str2, ey3Var, sa2Var);
                    u5bVar.d.a.getReference().c(ru6Var.c(str2, false));
                    u5bVar.e.a.getReference().c(ru6Var.c(str2, true));
                    u5bVar.g.set(ru6Var.d(str2), false);
                    hx8 hx8Var = u5bVar.f;
                    File fileB = ey3Var.b(str2, "rollouts-state");
                    if (fileB.exists()) {
                        try {
                            if (fileB.length() == 0) {
                                ru6.g(fileB, "The file has a length of zero for session: " + str2);
                                listB = Collections.EMPTY_LIST;
                            } else {
                                try {
                                    fileInputStream = new FileInputStream(fileB);
                                    try {
                                        listB = ru6.b(po1.i(fileInputStream));
                                        String str3 = "Loaded rollouts state:\n" + listB + "\nfor session " + str2;
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", str3, null);
                                        }
                                        po1.b(fileInputStream, "Failed to close rollouts state file.");
                                    } catch (Exception e) {
                                        e = e;
                                        Log.w("FirebaseCrashlytics", "Error deserializing rollouts state.", e);
                                        ru6.f(fileB);
                                        po1.b(fileInputStream, "Failed to close rollouts state file.");
                                        listB = Collections.EMPTY_LIST;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    fileInputStream = null;
                                } catch (Throwable th) {
                                    th = th;
                                    closeable = null;
                                    po1.b(closeable, "Failed to close rollouts state file.");
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            closeable = null;
                        }
                    } else {
                        ru6.g(fileB, "The file has a length of zero for session: " + str2);
                        listB = Collections.EMPTY_LIST;
                    }
                    hx8Var.b(listB);
                    fa2 fa2Var = hh9Var2.b;
                    long jLastModified = fa2Var.b.b(str2, "start-time").lastModified();
                    Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                            if (next.getTimestamp() < jLastModified) {
                            }
                        }
                        next = null;
                        break;
                    } while (next.getReason() != 6);
                    if (next == null) {
                        String strA = ct1.a("No relevant ApplicationExitInfo occurred during session: ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strA, null);
                        }
                        hh9Var = hh9Var2;
                        z3 = true;
                    } else {
                        w92 w92Var = hh9Var2.a;
                        try {
                            InputStream traceInputStream = next.getTraceInputStream();
                            strC = traceInputStream != null ? hh9.c(traceInputStream) : null;
                        } catch (IOException e3) {
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + next.toString() + " Error: " + e3, null);
                        }
                        ad0.a aVar = new ad0.a();
                        aVar.d = next.getImportance();
                        aVar.j = (byte) (aVar.j | 4);
                        String processName = next.getProcessName();
                        if (processName == null) {
                            ac4.c("Null processName");
                            return;
                        }
                        aVar.b = processName;
                        aVar.c = next.getReason();
                        aVar.j = (byte) (aVar.j | 2);
                        aVar.g = next.getTimestamp();
                        aVar.j = (byte) (aVar.j | 32);
                        aVar.a = next.getPid();
                        aVar.j = (byte) (aVar.j | 1);
                        aVar.e = next.getPss();
                        aVar.j = (byte) (aVar.j | 8);
                        aVar.f = next.getRss();
                        aVar.j = (byte) (aVar.j | 16);
                        aVar.h = strC;
                        ad0 ad0VarA = aVar.a();
                        int i5 = w92Var.a.getResources().getConfiguration().orientation;
                        jd0.a aVar2 = new jd0.a();
                        aVar2.b = "anr";
                        aVar2.a = ad0VarA.g;
                        aVar2.g = (byte) (aVar2.g | 1);
                        s00 s00Var = w92Var.c;
                        if (!w92Var.e.b().b.c || s00Var.c.size() <= 0) {
                            hh9Var = hh9Var2;
                            listUnmodifiableList = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = s00Var.c;
                            int size = arrayList3.size();
                            int i6 = 0;
                            while (i6 < size) {
                                Object obj2 = arrayList3.get(i6);
                                int i7 = i6 + 1;
                                ny0 ny0Var = (ny0) obj2;
                                ArrayList arrayList4 = arrayList3;
                                String str4 = ny0Var.a;
                                if (str4 == null) {
                                    ac4.c("Null libraryName");
                                    return;
                                }
                                int i8 = size;
                                String str5 = ny0Var.b;
                                if (str5 == null) {
                                    ac4.c("Null arch");
                                    return;
                                }
                                String str6 = ny0Var.c;
                                if (str6 == null) {
                                    ac4.c("Null buildId");
                                    return;
                                }
                                arrayList2.add(new bd0(str5, str4, str6));
                                i6 = i7;
                                arrayList3 = arrayList4;
                                size = i8;
                                hh9Var2 = hh9Var2;
                            }
                            hh9Var = hh9Var2;
                            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                        }
                        ad0.a aVar3 = new ad0.a();
                        aVar3.d = ad0VarA.d;
                        byte b = (byte) (aVar3.j | 4);
                        aVar3.j = b;
                        String str7 = ad0VarA.b;
                        if (str7 == null) {
                            ac4.c("Null processName");
                            return;
                        }
                        aVar3.b = str7;
                        aVar3.c = ad0VarA.c;
                        aVar3.g = ad0VarA.g;
                        aVar3.a = ad0VarA.a;
                        aVar3.e = ad0VarA.e;
                        aVar3.f = ad0VarA.f;
                        aVar3.j = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 32)) | 1)) | 8)) | 16);
                        aVar3.h = ad0VarA.h;
                        aVar3.i = listUnmodifiableList;
                        ad0 ad0VarA2 = aVar3.a();
                        Boolean boolValueOf = Boolean.valueOf(ad0VarA2.d != 100);
                        String str8 = ad0VarA2.b;
                        int i9 = ad0VarA2.a;
                        int i10 = ad0VarA2.d;
                        str8.getClass();
                        rd0.a aVar4 = new rd0.a();
                        aVar4.a = str8;
                        aVar4.b = i9;
                        byte b2 = (byte) (aVar4.e | 1);
                        aVar4.c = i10;
                        aVar4.d = false;
                        aVar4.e = (byte) (((byte) (b2 | 2)) | 4);
                        rd0 rd0VarA = aVar4.a();
                        od0 od0VarE = w92.e();
                        List<u92.e.d.a.b.AbstractC0258a> listA = w92Var.a();
                        if (listA == null) {
                            ac4.c("Null binaries");
                            return;
                        }
                        aVar2.c = new kd0(new ld0(null, null, ad0VarA2, od0VarE, listA), null, null, boolValueOf, rd0VarA, null, i5);
                        aVar2.d = w92Var.b(i5);
                        jd0 jd0VarA = aVar2.a();
                        String strA2 = ct1.a("Persisting anr for session ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", strA2, null);
                        }
                        z3 = true;
                        fa2Var.d(hh9.b(hh9.a(jd0VarA, qd6Var, u5bVar, Collections.EMPTY_MAP), u5bVar), str2, true);
                    }
                    i = 2;
                } else {
                    hh9Var = hh9Var2;
                    z3 = true;
                    i3 = 8;
                    String strA3 = ct1.a("No ApplicationExitInfo available. Session: ", str2);
                    i = 2;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        r11 = 0;
                        Log.v("FirebaseCrashlytics", strA3, null);
                    }
                }
                r11 = 0;
            } else {
                hh9Var = hh9Var2;
                i = 2;
                obj = null;
                z3 = true;
                i3 = 8;
                String strA4 = pp2.a(i4, "ANR feature enabled, but device is API ");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    r11 = obj;
                    Log.v("FirebaseCrashlytics", strA4, null);
                    r11 = obj;
                }
            }
        } else {
            hh9Var = hh9Var2;
            i = 2;
            Object obj3 = null;
            z3 = true;
            i2 = 4;
            i3 = 8;
            r11 = obj3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
                r11 = obj3;
            }
        }
        if (z2 && n92Var.c(str2)) {
            String strA5 = ct1.a("Finalizing native report for session ", str2);
            if (Log.isLoggable("FirebaseCrashlytics", i)) {
                Log.v("FirebaseCrashlytics", strA5, r11);
            }
            n92Var.a(str2).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str2, r11);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str2, r11);
            Log.w("FirebaseCrashlytics", "No native core present", r11);
        }
        if (z != 0) {
            z4 = false;
            str = (String) arrayList.get(0);
        } else {
            z4 = false;
            this.l.d(r11);
            str = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        fa2 fa2Var2 = hh9Var.b;
        ey3 ey3Var2 = fa2Var2.b;
        ey3Var2.a(".com.google.firebase.crashlytics");
        ey3Var2.a(".com.google.firebase.crashlytics-ndk");
        if (!ey3Var2.a.isEmpty()) {
            ey3Var2.a(".com.google.firebase.crashlytics.files.v1");
            final String str9 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file = ey3Var2.b;
            if (file.exists() && (list = file.list(new FilenameFilter() { // from class: dy3
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str10) {
                    return str10.startsWith(str9);
                }
            })) != null) {
                int length = list.length;
                for (?? r9 = z4; r9 < length; r9++) {
                    ey3Var2.a(list[r9]);
                }
            }
        }
        NavigableSet<String> navigableSetC = fa2Var2.c();
        if (str != null) {
            navigableSetC.remove(str);
        }
        int i11 = i3;
        if (navigableSetC.size() > i11) {
            while (navigableSetC.size() > i11) {
                String str10 = (String) navigableSetC.last();
                String strA6 = ct1.a("Removing session over cap: ", str10);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strA6, null);
                }
                ey3.d(new File(ey3Var2.d, str10));
                navigableSetC.remove(str10);
            }
        }
        for (String str11 : navigableSetC) {
            String strA7 = ct1.a("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strA7, null);
            }
            aa2 aa2Var = fa2.g;
            ca2 ca2Var = fa2.i;
            File file2 = new File(ey3Var2.d, str11);
            file2.mkdirs();
            List<File> listE = ey3.e(file2.listFiles(ca2Var));
            if (listE.isEmpty()) {
                String strC2 = sk0.c("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strC2, null);
                }
            } else {
                Collections.sort(listE);
                ArrayList arrayList5 = new ArrayList();
                boolean z6 = z4;
                for (File file3 : listE) {
                    try {
                        String strE = fa2.e(file3);
                        aa2Var.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strE));
                            try {
                                jd0 jd0VarE = aa2.e(jsonReader);
                                jsonReader.close();
                                arrayList5.add(jd0VarE);
                                if (z6) {
                                    z5 = z3;
                                } else {
                                    String name = file3.getName();
                                    if (name.startsWith("event") && name.endsWith("_")) {
                                        z5 = z3;
                                    } else {
                                        z5 = false;
                                    }
                                }
                                z6 = z5;
                            } catch (Throwable th3) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (IllegalStateException e4) {
                            throw new IOException(e4);
                        }
                    } catch (IOException e5) {
                        Log.w("FirebaseCrashlytics", "Could not add event to report for " + file3, e5);
                    }
                }
                if (arrayList5.isEmpty()) {
                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                } else {
                    String strD = new ru6(ey3Var2).d(str11);
                    u82 u82Var = fa2Var2.d.b;
                    synchronized (u82Var) {
                        if (Objects.equals(u82Var.b, str11)) {
                            strSubstring = u82Var.c;
                        } else {
                            ey3 ey3Var3 = u82Var.a;
                            s82 s82Var = u82.d;
                            File file4 = new File(ey3Var3.d, str11);
                            file4.mkdirs();
                            List listE2 = ey3.e(file4.listFiles(s82Var));
                            if (listE2.isEmpty()) {
                                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
                                strSubstring = null;
                            } else {
                                strSubstring = ((File) Collections.min(listE2, u82.e)).getName().substring(i2);
                            }
                        }
                    }
                    File fileB2 = ey3Var2.b(str11, "report");
                    try {
                        String strE2 = fa2.e(fileB2);
                        aa2Var.getClass();
                        yc0 yc0VarN = aa2.i(strE2).n(jCurrentTimeMillis, strD, z6);
                        yc0.a aVarM = yc0VarN.m();
                        aVarM.g = strSubstring;
                        u92.e eVar = yc0VarN.k;
                        if (eVar != null) {
                            fd0.a aVarM2 = eVar.m();
                            aVarM2.c = strSubstring;
                            aVarM.j = aVarM2.a();
                        }
                        yc0 yc0VarA = aVarM.a();
                        if (yc0VarA.k == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        yc0.a aVarM3 = yc0VarA.m();
                        fd0.a aVarM4 = yc0VarA.k.m();
                        aVarM4.k = arrayList5;
                        aVarM3.j = aVarM4.a();
                        yc0 yc0VarA2 = aVarM3.a();
                        u92.e eVar2 = yc0VarA2.k;
                        if (eVar2 != null) {
                            String str12 = "appQualitySessionId: " + strSubstring;
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    try {
                                        Log.d("FirebaseCrashlytics", str12, null);
                                    } catch (IOException e6) {
                                        e = e6;
                                        Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB2, e);
                                    }
                                }
                                fa2.f(z6 ? new File(ey3Var2.f, eVar2.h()) : new File(ey3Var2.e, eVar2.h()), aa2.a.a(yc0VarA2));
                            } catch (IOException e7) {
                                e = e7;
                                Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB2, e);
                            }
                        }
                        e = e6;
                    } catch (IOException e8) {
                        e = e8;
                    }
                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileB2, e);
                }
                ey3.d(new File(ey3Var2.d, str11));
                z4 = false;
                i2 = 4;
            }
            ey3.d(new File(ey3Var2.d, str11));
            z4 = false;
            i2 = 4;
        }
        nk9.b bVar = fa2Var2.c.b().a;
        ArrayList arrayListB = fa2Var2.b();
        int size2 = arrayListB.size();
        if (size2 <= 4) {
            return;
        }
        Iterator it2 = arrayListB.subList(4, size2).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    public final void c(final String str, Boolean bool) {
        Integer num;
        final Map mapUnmodifiableMap;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strA = ct1.a("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strA, null);
        }
        Locale locale = Locale.US;
        z65 z65Var = this.f;
        s00 s00Var = this.h;
        af0 af0Var = new af0(z65Var.c, s00Var.f, s00Var.g, z65Var.c().a, b3.b(s00Var.d != null ? 4 : 1), s00Var.h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        cf0 cf0Var = new cf0(po1.g());
        Context context = this.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        po1.a aVar = po1.a.t;
        String str4 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str4)) {
            po1.a aVar2 = (po1.a) po1.a.u.get(str4.toLowerCase(locale));
            if (aVar2 != null) {
                aVar = aVar2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = aVar.ordinal();
        String str5 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = po1.a(context);
        boolean zF = po1.f();
        int iC = po1.c();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        this.j.d(str, jCurrentTimeMillis, new ze0(af0Var, cf0Var, new bf0(iOrdinal, iAvailableProcessors, jA, blockCount, zF, iC)));
        if (bool.booleanValue() && str != null) {
            final u5b u5bVar = this.d;
            synchronized (u5bVar.c) {
                u5bVar.c = str;
                kp5 reference = u5bVar.d.a.getReference();
                synchronized (reference) {
                    mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.a));
                }
                final List<gx8> listA = u5bVar.f.a();
                u5bVar.b.b.a(new Runnable() { // from class: s5b
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        u5b u5bVar2 = u5bVar;
                        ru6 ru6Var = u5bVar2.a;
                        AtomicMarkableReference<String> atomicMarkableReference = u5bVar2.g;
                        String reference2 = atomicMarkableReference.getReference();
                        String str8 = str;
                        if (reference2 != null) {
                            String reference3 = atomicMarkableReference.getReference();
                            File fileB = ru6Var.a.b(str8, "user-data");
                            BufferedWriter bufferedWriter = null;
                            try {
                                try {
                                    qu6 qu6Var = new qu6();
                                    qu6Var.put("userId", reference3);
                                    String string = qu6Var.toString();
                                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), ru6.b));
                                    try {
                                        bufferedWriter2.write(string);
                                        bufferedWriter2.flush();
                                        po1.b(bufferedWriter2, "Failed to close user metadata file.");
                                    } catch (Exception e) {
                                        e = e;
                                        bufferedWriter = bufferedWriter2;
                                        Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                                        po1.b(bufferedWriter, "Failed to close user metadata file.");
                                    } catch (Throwable th) {
                                        th = th;
                                        bufferedWriter = bufferedWriter2;
                                        po1.b(bufferedWriter, "Failed to close user metadata file.");
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                        }
                        Map<String, String> map = mapUnmodifiableMap;
                        if (!map.isEmpty()) {
                            ru6Var.h(str8, map, false);
                        }
                        List<gx8> list = listA;
                        if (list.isEmpty()) {
                            return;
                        }
                        ru6Var.i(str8, list);
                    }
                });
            }
        }
        qd6 qd6Var = this.i;
        qd6Var.b.a();
        qd6Var.b = qd6.c;
        if (str != null) {
            qd6Var.b = new rg8(qd6Var.a.b(str, "userlog"));
        }
        this.l.d(str);
        hh9 hh9Var = this.m;
        w92 w92Var = hh9Var.a;
        Charset charset = u92.a;
        yc0.a aVar3 = new yc0.a();
        aVar3.a = "20.0.6";
        s00 s00Var2 = w92Var.c;
        String str8 = s00Var2.a;
        if (str8 == null) {
            ac4.c("Null gmpAppId");
            return;
        }
        aVar3.b = str8;
        z65 z65Var2 = w92Var.b;
        String str9 = z65Var2.c().a;
        if (str9 == null) {
            ac4.c("Null installationUuid");
            return;
        }
        aVar3.d = str9;
        aVar3.e = z65Var2.c().b;
        aVar3.f = z65Var2.c().c;
        String str10 = s00Var2.f;
        if (str10 == null) {
            ac4.c("Null buildVersion");
            return;
        }
        aVar3.h = str10;
        String str11 = s00Var2.g;
        if (str11 == null) {
            ac4.c("Null displayVersion");
            return;
        }
        aVar3.i = str11;
        aVar3.c = 4;
        aVar3.m = (byte) (aVar3.m | 1);
        fd0.a aVar4 = new fd0.a();
        aVar4.f = false;
        byte b = (byte) (aVar4.m | 2);
        aVar4.d = jCurrentTimeMillis;
        aVar4.m = (byte) (b | 1);
        if (str == null) {
            ac4.c("Null identifier");
            return;
        }
        aVar4.b = str;
        String str12 = w92.g;
        if (str12 == null) {
            ac4.c("Null generator");
            return;
        }
        aVar4.a = str12;
        String str13 = z65Var2.c;
        if (str13 == null) {
            ac4.c("Null identifier");
            return;
        }
        String str14 = z65Var2.c().a;
        wy2 wy2Var = s00Var2.h;
        if (wy2Var.b == null) {
            wy2Var.b = new wy2.a(wy2Var);
        }
        wy2.a aVar5 = wy2Var.b;
        String str15 = aVar5.a;
        if (aVar5 == null) {
            wy2Var.b = new wy2.a(wy2Var);
        }
        aVar4.g = new gd0(str13, str10, str11, str14, str15, wy2Var.b.b);
        xd0.a aVar6 = new xd0.a();
        aVar6.a = 3;
        aVar6.e = (byte) (aVar6.e | 1);
        if (str2 == null) {
            ac4.c("Null version");
            return;
        }
        aVar6.b = str2;
        if (str3 == null) {
            ac4.c("Null buildVersion");
            return;
        }
        aVar6.c = str3;
        aVar6.d = po1.g();
        aVar6.e = (byte) (aVar6.e | 2);
        aVar4.i = aVar6.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) w92.f.get(str4.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = po1.a(w92Var.a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zF2 = po1.f();
        int iC2 = po1.c();
        id0.a aVar7 = new id0.a();
        aVar7.a = iIntValue;
        byte b2 = (byte) (aVar7.j | 1);
        aVar7.j = b2;
        if (str5 == null) {
            ac4.c("Null model");
            return;
        }
        aVar7.b = str5;
        aVar7.c = iAvailableProcessors2;
        aVar7.d = jA2;
        aVar7.e = blockCount2;
        aVar7.f = zF2;
        aVar7.g = iC2;
        aVar7.j = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        if (str6 == null) {
            ac4.c("Null manufacturer");
            return;
        }
        aVar7.h = str6;
        if (str7 == 0) {
            ac4.c("Null modelClass");
            return;
        }
        aVar7.i = str7;
        aVar4.j = aVar7.a();
        aVar4.l = 3;
        aVar4.m = (byte) (aVar4.m | 4);
        aVar3.j = aVar4.a();
        yc0 yc0VarA = aVar3.a();
        ey3 ey3Var = hh9Var.b.b;
        u92.e eVar = yc0VarA.k;
        if (eVar == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String strH = eVar.h();
        try {
            fa2.g.getClass();
            fa2.f(ey3Var.b(strH, "report"), aa2.a.a(yc0VarA));
            File fileB = ey3Var.b(strH, "start-time");
            long j = eVar.j();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileB), fa2.e);
            try {
                outputStreamWriter.write(BuildConfig.FLAVOR);
                fileB.setLastModified(j * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            String strA2 = ct1.a("Could not persist report for session ", strH);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strA2, e);
            }
        }
    }

    public final boolean d(xk9 xk9Var) throws Throwable {
        sa2.a();
        la2 la2Var = this.n;
        if (la2Var != null && la2Var.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, xk9Var, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetC = this.m.b.c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final String f() throws IOException {
        InputStream resourceAsStream;
        Context context = this.a;
        int iD = po1.d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iD == 0 ? null : context.getResources().getString(iD);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(s), 0);
        }
        ClassLoader classLoader = d92.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = resourceAsStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        resourceAsStream.close();
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
            resourceAsStream.close();
            throw th4;
        }
    }

    public final void g() {
        try {
            String strF = f();
            if (strF != null) {
                try {
                    this.d.a(strF);
                } catch (IllegalArgumentException e) {
                    Context context = this.a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    public final void h(q6d q6dVar) {
        q6d q6dVar2;
        q6d q6dVarA;
        t9a<Boolean> t9aVar = this.o;
        ey3 ey3Var = this.m.b.b;
        if (ey3.e(ey3Var.e.listFiles()).isEmpty() && ey3.e(ey3Var.f.listFiles()).isEmpty() && ey3.e(ey3Var.g.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            t9aVar.d(Boolean.FALSE);
            return;
        }
        zd6 zd6Var = zd6.t;
        zd6Var.e("Crash reports are available to be sent.");
        se2 se2Var = this.b;
        if (se2Var.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            t9aVar.d(Boolean.FALSE);
            q6dVarA = caa.e(Boolean.TRUE);
        } else {
            zd6Var.c("Automatic data collection is disabled.");
            zd6Var.e("Notifying that unsent reports are available.");
            t9aVar.d(Boolean.TRUE);
            synchronized (se2Var.b) {
                q6dVar2 = se2Var.c.a;
            }
            ay ayVar = new ay();
            q6dVar2.getClass();
            p4d p4dVar = u9a.a;
            q6d q6dVar3 = new q6d();
            q6dVar2.b.a(new zyc(p4dVar, ayVar, q6dVar3));
            q6dVar2.u();
            zd6Var.c("Waiting for send/deleteUnsentReports to be called.");
            q6dVarA = ka2.a(q6dVar3, this.p.a);
        }
        q6dVarA.o(this.e.a, new b92(this, q6dVar));
    }
}
