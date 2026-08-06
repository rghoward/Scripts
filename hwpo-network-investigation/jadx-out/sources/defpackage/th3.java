package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class th3 {
    public static final uh3 a = new uh3(new zva((et3) null, (sr9) null, (o91) null, (t39) null, (LinkedHashMap) null, 127));

    public abstract zva a();

    public final uh3 b(th3 th3Var) {
        et3 et3Var = th3Var.a().a;
        if (et3Var == null) {
            et3Var = a().a;
        }
        sr9 sr9Var = th3Var.a().b;
        if (sr9Var == null) {
            sr9Var = a().b;
        }
        o91 o91Var = th3Var.a().c;
        if (o91Var == null) {
            o91Var = a().c;
        }
        t39 t39Var = th3Var.a().d;
        if (t39Var == null) {
            t39Var = a().d;
        }
        th3Var.a().getClass();
        a().getClass();
        Map<Object, Object> map = a().f;
        Map<Object, Object> map2 = th3Var.a().f;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new uh3(new zva(et3Var, sr9Var, o91Var, t39Var, linkedHashMap, 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof th3) && xj5.a(((th3) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        if (equals(a)) {
            return "EnterTransition.None";
        }
        zva zvaVarA = a();
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        et3 et3Var = zvaVarA.a;
        sb.append(et3Var != null ? et3Var.toString() : null);
        sb.append(",\nSlide - ");
        sr9 sr9Var = zvaVarA.b;
        sb.append(sr9Var != null ? sr9Var.toString() : null);
        sb.append(",\nShrink - ");
        o91 o91Var = zvaVarA.c;
        sb.append(o91Var != null ? o91Var.toString() : null);
        sb.append(",\nScale - ");
        t39 t39Var = zvaVarA.d;
        sb.append(t39Var != null ? t39Var.toString() : null);
        return sb.toString();
    }
}
