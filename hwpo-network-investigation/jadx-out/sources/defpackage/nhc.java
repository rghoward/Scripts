package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nhc implements Runnable {
    public final /* synthetic */ int t;
    public final /* synthetic */ String u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ thc y;

    public nhc(thc thcVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.t = i;
        this.u = str;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = thcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        thc thcVar = this.y;
        zic zicVar = thcVar.a.e;
        tkc.k(zicVar);
        if (!zicVar.b) {
            Log.println(6, thcVar.q(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (thcVar.c == 0) {
            t7c t7cVar = thcVar.a.d;
            if (t7cVar.e == null) {
                synchronized (t7cVar) {
                    try {
                        if (t7cVar.e == null) {
                            tkc tkcVar = t7cVar.a;
                            ApplicationInfo applicationInfo = tkcVar.a.getApplicationInfo();
                            String strA = na8.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                t7cVar.e = Boolean.valueOf(str != null && str.equals(strA));
                            }
                            if (t7cVar.e == null) {
                                t7cVar.e = Boolean.TRUE;
                                thc thcVar2 = tkcVar.f;
                                tkc.m(thcVar2);
                                thcVar2.f.a("My process not in the list of running processes");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (t7cVar.e.booleanValue()) {
                thcVar.c = 'C';
            } else {
                thcVar.c = 'c';
            }
        }
        if (thcVar.d < 0) {
            thcVar.a.d.m();
            thcVar.d = 161000L;
        }
        int i = this.t;
        char c = thcVar.c;
        long j = thcVar.d;
        String str2 = this.u;
        Object obj = this.v;
        Object obj2 = this.w;
        Object obj3 = this.x;
        char cCharAt = "01VDIWEA?".charAt(i);
        String strR = thc.r(true, str2, obj, obj2, obj3);
        StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + strR.length());
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c);
        sb.append(j);
        sb.append(":");
        sb.append(strR);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = str2.substring(0, 1024);
        }
        vic vicVar = zicVar.e;
        if (vicVar != null) {
            String str3 = vicVar.c;
            zic zicVar2 = vicVar.e;
            zicVar2.g();
            if (vicVar.e.k().getLong(vicVar.a, 0L) == 0) {
                vicVar.a();
            }
            SharedPreferences sharedPreferencesK = zicVar2.k();
            String str4 = vicVar.b;
            long j2 = sharedPreferencesK.getLong(str4, 0L);
            if (j2 <= 0) {
                SharedPreferences.Editor editorEdit = zicVar2.k().edit();
                editorEdit.putString(str3, string);
                editorEdit.putLong(str4, 1L);
                editorEdit.apply();
                return;
            }
            yzc yzcVar = zicVar2.a.i;
            tkc.k(yzcVar);
            long jNextLong = yzcVar.g0().nextLong() & Long.MAX_VALUE;
            long j3 = j2 + 1;
            long j4 = Long.MAX_VALUE / j3;
            SharedPreferences.Editor editorEdit2 = zicVar2.k().edit();
            if (jNextLong < j4) {
                editorEdit2.putString(str3, string);
            }
            editorEdit2.putLong(str4, j3);
            editorEdit2.apply();
        }
    }
}
