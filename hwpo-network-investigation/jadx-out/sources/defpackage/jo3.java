package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jo3 {
    public static final ko3 a = new ko3(new zva((et3) null, (sr9) null, (o91) null, (t39) null, (LinkedHashMap) null, 127));
    public static final ko3 b = new ko3(new zva((et3) null, (sr9) null, (o91) null, (t39) null, (LinkedHashMap) null, 95));

    public abstract zva a();

    public final ko3 b(jo3 jo3Var) {
        et3 et3Var = jo3Var.a().a;
        if (et3Var == null) {
            et3Var = a().a;
        }
        sr9 sr9Var = jo3Var.a().b;
        if (sr9Var == null) {
            sr9Var = a().b;
        }
        o91 o91Var = jo3Var.a().c;
        if (o91Var == null) {
            o91Var = a().c;
        }
        t39 t39Var = jo3Var.a().d;
        if (t39Var == null) {
            t39Var = a().d;
        }
        jo3Var.a().getClass();
        a().getClass();
        boolean z = jo3Var.a().e || a().e;
        Map<Object, Object> map = a().f;
        Map<Object, Object> map2 = jo3Var.a().f;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new ko3(new zva(et3Var, sr9Var, o91Var, t39Var, z, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jo3) && xj5.a(((jo3) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        if (equals(a)) {
            return "ExitTransition.None";
        }
        if (equals(b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        zva zvaVarA = a();
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(zvaVarA.e);
        return sb.toString();
    }
}
