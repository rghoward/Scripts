package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w92 {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final z65 b;
    public final s00 c;
    public final dv6 d;
    public final xk9 e;

    static {
        HashMap map = new HashMap();
        f = map;
        i4.a(5, map, "armeabi", 6, "armeabi-v7a");
        i4.a(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.0.6";
    }

    public w92(Context context, z65 z65Var, s00 s00Var, dv6 dv6Var, xk9 xk9Var) {
        this.a = context;
        this.b = z65Var;
        this.c = s00Var;
        this.d = dv6Var;
        this.e = xk9Var;
    }

    public static nd0 c(eya eyaVar, int i) {
        String str = eyaVar.b;
        String str2 = eyaVar.a;
        StackTraceElement[] stackTraceElementArr = eyaVar.c;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        eya eyaVar2 = eyaVar.d;
        if (i >= 8) {
            eya eyaVar3 = eyaVar2;
            while (eyaVar3 != null) {
                eyaVar3 = eyaVar3.d;
                i2++;
            }
        }
        int i3 = i2;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            ac4.c("Null frames");
            return null;
        }
        byte b = (byte) (0 | 1);
        nd0 nd0VarC = (eyaVar2 == null || i3 != 0) ? null : c(eyaVar2, i + 1);
        if (b == 1) {
            return new nd0(str, str2, listD, nd0VarC, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        aa0.c(v92.a("Missing required properties:", sb));
        return null;
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            qd0.a aVar = new qd0.a();
            aVar.e = i;
            aVar.f = (byte) (aVar.f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            aVar.a = jMax;
            byte b = (byte) (aVar.f | 1);
            aVar.b = str;
            aVar.c = fileName;
            aVar.d = lineNumber;
            aVar.f = (byte) (b | 2);
            arrayList.add(aVar.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static od0 e() {
        return new od0("0", "0", 0L);
    }

    public final List<u92.e.d.a.b.AbstractC0258a> a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        s00 s00Var = this.c;
        String str = s00Var.e;
        if (str == null) {
            ac4.c("Null name");
            return null;
        }
        String str2 = s00Var.b;
        if (b == 3) {
            return Collections.singletonList(new md0(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        aa0.c(v92.a("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    public final sd0 b(int i) {
        boolean z;
        Float fValueOf;
        int i2;
        long j;
        Context context = this.a;
        boolean z2 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1 && intExtra3 != -1) {
                        fValueOf = Float.valueOf(intExtra2 / intExtra3);
                    }
                } catch (IllegalStateException e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
                Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
                if (z || fValueOf == null) {
                    i2 = 1;
                } else {
                    i2 = ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
                }
                if (!po1.f() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z2 = true;
                }
                long jA = po1.a(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = jA - memoryInfo.availMem;
                if (j <= 0) {
                    j = 0;
                }
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                long blockSize = statFs.getBlockSize();
                long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
                sd0.a aVar = new sd0.a();
                aVar.a = dValueOf;
                aVar.b = i2;
                byte b = (byte) (aVar.g | 1);
                aVar.c = z2;
                aVar.d = i;
                aVar.e = j;
                aVar.f = blockCount;
                aVar.g = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
                return aVar.a();
            }
            z = false;
        } catch (IllegalStateException e2) {
            e = e2;
            z = false;
        }
        fValueOf = null;
        if (fValueOf != null) {
        }
        if (z) {
            i2 = 1;
        } else {
            i2 = 1;
        }
        if (!po1.f()) {
            z2 = true;
        }
        long jA2 = po1.a(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j = jA2 - memoryInfo2.availMem;
        if (j <= 0) {
            j = 0;
        }
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize2 = statFs2.getBlockSize();
        long blockCount2 = (((long) statFs2.getBlockCount()) * blockSize2) - (blockSize2 * ((long) statFs2.getAvailableBlocks()));
        sd0.a aVar2 = new sd0.a();
        aVar2.a = dValueOf;
        aVar2.b = i2;
        byte b2 = (byte) (aVar2.g | 1);
        aVar2.c = z2;
        aVar2.d = i;
        aVar2.e = j;
        aVar2.f = blockCount2;
        aVar2.g = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
        return aVar2.a();
    }
}
