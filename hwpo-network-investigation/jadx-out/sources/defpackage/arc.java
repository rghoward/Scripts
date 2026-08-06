package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class arc {
    public static volatile sk7 a;

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:74:0x0174, B:15:0x0025, B:17:0x002d, B:21:0x003a, B:23:0x0040, B:25:0x0048, B:73:0x0170, B:75:0x0177, B:76:0x017a, B:77:0x017b, B:26:0x004c, B:28:0x0050, B:29:0x005d, B:31:0x0063, B:37:0x0079, B:39:0x007f, B:40:0x008b, B:60:0x0154, B:61:0x0157, B:69:0x0167, B:68:0x0164, B:70:0x0168, B:71:0x016d, B:72:0x016e, B:32:0x0069, B:36:0x0070), top: B:82:0x0007, inners: #4 }] */
    public static sk7 a(Context context) {
        sk7 sk7Var;
        sk7 i88Var;
        sk7 i88Var2;
        sk7 sk7Var2 = a;
        if (sk7Var2 != null) {
            return sk7Var2;
        }
        synchronized (arc.class) {
            try {
                sk7Var = a;
                if (sk7Var == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    n30 n30Var = crc.a;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        sk7Var = f0.t;
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        Context contextCreateDeviceProtectedStorageContext = !context.isDeviceProtectedStorage() ? context.createDeviceProtectedStorageContext() : context;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c = 0;
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                i88Var = file.exists() ? new i88(file) : f0.t;
                            } catch (RuntimeException e) {
                                Log.e("HermeticFileOverrides", "no data dir", e);
                                i88Var = f0.t;
                            }
                            if (i88Var.b()) {
                                File file2 = (File) i88Var.a();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        ep9 ep9Var = new ep9();
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb = new StringBuilder(line.length() + 9);
                                                sb.append("Invalid: ");
                                                sb.append(line);
                                                Log.e("HermeticFileOverrides", sb.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                ep9 ep9Var2 = (ep9) ep9Var.get(str3);
                                                if (ep9Var2 == null) {
                                                    ep9Var2 = new ep9();
                                                    ep9Var.put(str3, ep9Var2);
                                                }
                                                ep9Var2.put(strDecode, strDecode2);
                                                c = 0;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb2.append("Parsed ");
                                        sb2.append(string);
                                        sb2.append(" for Android package ");
                                        sb2.append(packageName);
                                        Log.w("HermeticFileOverrides", sb2.toString());
                                        yqc yqcVar = new yqc(ep9Var);
                                        bufferedReader.close();
                                        i88Var2 = new i88(yqcVar);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else {
                                i88Var2 = f0.t;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            sk7Var = i88Var2;
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        sk7Var = f0.t;
                    }
                    a = sk7Var;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return sk7Var;
    }
}
