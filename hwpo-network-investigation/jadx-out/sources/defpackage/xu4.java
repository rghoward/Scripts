package defpackage;

import android.content.Context;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xu4 {
    public static final t78.a<Long> b = new t78.a<>("fire-global");
    public static final t78.a<Long> c = new t78.a<>("fire-count");
    public static final t78.a<String> d = new t78.a<>("last-used-date");
    public final al5 a;

    public xu4(Context context, String str) {
        this.a = new al5(context, "FirebaseHeartBeat".concat(str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            al5 al5Var = this.a;
            al5Var.getClass();
            for (Map.Entry entry : ((Map) oy0.f(ff3.t, new xk5(al5Var, null))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new ge0(((t78.a) entry.getKey()).a, new ArrayList(hashSet)));
                    }
                }
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.a.a(new oh4() { // from class: wu4
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        ((x27) obj).g(xu4.b, Long.valueOf(jCurrentTimeMillis));
                        return null;
                    }
                });
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String b(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized t78.a<Set<String>> c(x27 x27Var, String str) {
        for (Map.Entry<t78.a<?>, Object> entry : x27Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = entry.getKey().a;
                        str2.getClass();
                        return new t78.a<>(str2);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(x27 x27Var, String str) {
        t78.a<?> aVarC = c(x27Var, str);
        if (aVarC == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) bl5.a(x27Var, aVarC, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            x27Var.e();
            x27Var.a.remove(aVarC);
        } else {
            x27Var.h(aVarC, hashSet);
        }
    }

    public final synchronized boolean e(t78.a<Long> aVar, long j) {
        ff3 ff3Var;
        long jLongValue;
        al5 al5Var = this.a;
        al5Var.getClass();
        aVar.getClass();
        yk5 yk5Var = new yk5(al5Var, aVar, null);
        ff3Var = ff3.t;
        jLongValue = ((Long) oy0.f(ff3Var, yk5Var)).longValue();
        synchronized (this) {
        }
        if (b(jLongValue).equals(b(j))) {
            return false;
        }
        al5 al5Var2 = this.a;
        Long lValueOf = Long.valueOf(j);
        al5Var2.getClass();
        return true;
    }
}
