package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import io.ably.lib.util.AgentHeaderCreator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractCollection;
import java.util.List;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g1d {
    public static Boolean d;
    public final lrc a;
    public final Uri b;
    public final String c;

    public g1d(lrc lrcVar, String str) {
        this.a = lrcVar;
        this.c = str;
        Context context = lrcVar.b;
        Pattern pattern = v2d.a;
        o2d o2dVar = new o2d(context);
        o2dVar.a("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append(AgentHeaderCreator.AGENT_DIVIDER);
        sb.append(str);
        sb.append(".pb");
        o2dVar.b(sb.toString());
        this.b = o2dVar.c();
    }

    public final f1d a() {
        String strSubstring;
        int i;
        owc owcVar;
        owc owcVar2;
        String str = this.c;
        lrc lrcVar = this.a;
        l5a l5aVar = lrcVar.f;
        if (!gqc.b(lrcVar.b)) {
            return new f1d(i1d.E(), new e1d(3, 17));
        }
        if (d == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                d = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getMethod("isIsolated", null).invoke(Process.class, null);
                    objInvoke.getClass();
                    d = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    d = Boolean.FALSE;
                }
            }
        }
        if (d.booleanValue()) {
            return new f1d(i1d.E(), new e1d(3, 18));
        }
        a1d a1dVarB = lrcVar.g.b();
        p0c p0cVar = a1dVarB.c;
        yzb yzbVar = yzb.FILE;
        n30 n30Var = crc.a;
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            strSubstring = str.substring(0, iIndexOf);
        } else {
            if (str.contains("@")) {
                z90.a("Invalid package name: ".concat(str));
                return null;
            }
            strSubstring = str;
        }
        if (!a1dVarB.h) {
            i = 14;
        } else if (!a1dVarB.a || !a1dVarB.b.contains(yzbVar)) {
            i = 3;
        } else if (p0cVar.e() != 0) {
            List list = a1dVarB.f;
            if (list.isEmpty() || list.contains(strSubstring)) {
                i = a1dVarB.g.contains(strSubstring) ? 6 : 0;
            } else {
                i = 5;
            }
        } else {
            i = 4;
        }
        if (i != 0) {
            owcVar2 = new owc(null, new e1d(i));
        } else {
            try {
                String str2 = a1dVarB.e;
                if (str2.isEmpty()) {
                    sk7 sk7Var = (sk7) lrcVar.h.get();
                    if (sk7Var.b()) {
                        str2 = ((ApplicationInfo) sk7Var.a()).dataDir;
                    } else {
                        nsc.a(Level.WARNING, lrcVar.a(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                        owcVar = new owc(evc.c, new e1d(3, 7));
                        owcVar2 = owcVar;
                    }
                }
                String str3 = File.separator;
                String str4 = a1dVarB.d;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
                sb.append(str2);
                sb.append(str3);
                sb.append(str4);
                String string = sb.toString();
                quc qucVar = new quc(p0cVar, str);
                Uri.Builder builderScheme = new Uri.Builder().scheme("file");
                String string2 = qucVar.a().toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + string.length() + String.valueOf(str3).length() + string2.length());
                sb2.append(str3);
                sb2.append(string);
                sb2.append(str3);
                sb2.append(string2);
                Uri uriBuild = builderScheme.appendEncodedPath(sb2.toString()).build();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        try {
                            owc owcVar3 = new owc((evc) ((j2d) l5aVar.get()).a(uriBuild, new avc(a1dVarB.k.x())), new e1d(5, 2));
                            StrictMode.setThreadPolicy(threadPolicy);
                            owcVar2 = owcVar3;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicy);
                            throw th;
                        }
                    } catch (FileNotFoundException unused2) {
                        nsc.a(Level.INFO, lrcVar.a(), null, "Shared storage file not found for %s", str);
                        owcVar2 = new owc(null, new e1d(8));
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                } catch (k2c e) {
                    nsc.a(Level.SEVERE, lrcVar.a(), e, "Failed to parse snapshot from shared storage for %s", str);
                    owcVar2 = new owc(null, new e1d(9));
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            } catch (Exception e2) {
                nsc.a(Level.WARNING, lrcVar.a(), e2, "Failed to read shared file for %s", str);
                owcVar = new owc(evc.c, new e1d(3, 10));
            }
        }
        e1d e1dVar = owcVar2.b;
        evc evcVar = owcVar2.a;
        if (evcVar != null) {
            return new f1d(evcVar, e1dVar);
        }
        int i2 = e1dVar.b;
        try {
            j2d j2dVar = (j2d) l5aVar.get();
            Uri uri = this.b;
            o3c o3cVarD = i1d.E().d();
            f1c f1cVar = f1c.b;
            int i3 = h0c.a;
            f1c f1cVar2 = f1c.c;
            InputStream inputStreamC = mp0.c(j2dVar.b(uri));
            try {
                u1c u1cVarA = o3cVarD.a(inputStreamC, f1cVar2);
                if (inputStreamC != null) {
                    inputStreamC.close();
                }
                return new f1d((i1d) u1cVarA, new e1d(4, i2));
            } catch (Throwable th2) {
                if (inputStreamC != null) {
                    try {
                        inputStreamC.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException | RuntimeException unused3) {
            nsc.a(Level.INFO, lrcVar.a(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str);
            return b() ? new f1d(evc.c, new e1d(3, 16)) : new f1d(i1d.E(), new e1d(3, 11));
        }
    }

    public final boolean b() {
        ovc ovcVarC = this.a.g.c();
        return ovcVarC.z() && ((AbstractCollection) ovcVarC.E()).contains(yzb.FILE);
    }
}
