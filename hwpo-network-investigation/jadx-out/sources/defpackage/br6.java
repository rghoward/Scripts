package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class br6 {
    public final ti8 a;

    public br6(ti8 ti8Var, pq8 pq8Var) {
        this.a = ti8Var;
    }

    public static f5a c(ug5.a aVar, k85 k85Var, ar6.a aVar2, ar6.b bVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(k85Var.a.getResources(), bVar.a);
        Map<String, Object> map = bVar.b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = v.a;
        if ((aVar instanceof bj8) && ((bj8) aVar).g) {
            z = true;
        }
        return new f5a(bitmapDrawable, k85Var, jf2.t, aVar2, str, zBooleanValue, z);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0 A[PHI: r17
      0x00e0: PHI (r17v2 double) = (r17v1 double), (r17v1 double), (r17v3 double) binds: [B:60:0x00dd, B:55:0x00d1, B:48:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    public final ar6.b a(k85 k85Var, ar6.a aVar, br9 br9Var, s39 s39Var) {
        double d;
        boolean zEquals;
        if (k85Var.q.t) {
            ar6 ar6VarE = this.a.e();
            ar6.b bVarB = ar6VarE != null ? ar6VarE.b(aVar) : null;
            if (bVarB != null) {
                Bitmap bitmap = bVarB.a;
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (pq8.b(k85Var, config)) {
                    Object obj = bVarB.b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    if (!br9Var.equals(br9.c)) {
                        String str = aVar.u.get("coil#transformation_size");
                        if (str != null) {
                            zEquals = str.equals(br9Var.toString());
                        } else {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            s03 s03Var = br9Var.a;
                            int i = s03Var instanceof s03.a ? ((s03.a) s03Var).a : Integer.MAX_VALUE;
                            s03 s03Var2 = br9Var.b;
                            int i2 = s03Var2 instanceof s03.a ? ((s03.a) s03Var2).a : Integer.MAX_VALUE;
                            double dG = eo7.g(width, height, i, i2, s39Var);
                            boolean zA = q.a(k85Var);
                            if (zA) {
                                double d2 = dG > 1.0d ? 1.0d : dG;
                                d = 1.0d;
                                if (Math.abs(((double) i) - (((double) width) * d2)) > 1.0d && Math.abs(((double) i2) - (d2 * ((double) height))) > 1.0d) {
                                    if ((dG == d && !zA) || (dG > d && zBooleanValue)) {
                                        zEquals = false;
                                    }
                                }
                            } else {
                                d = 1.0d;
                                if ((i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && Math.abs(i - width) > 1) || (i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && Math.abs(i2 - height) > 1)) {
                                    if (dG == d) {
                                        zEquals = false;
                                    } else {
                                        zEquals = false;
                                    }
                                }
                            }
                            zEquals = true;
                        }
                    } else if (zBooleanValue) {
                        zEquals = false;
                    } else {
                        zEquals = true;
                    }
                } else {
                    zEquals = false;
                }
                if (zEquals) {
                    return bVarB;
                }
            }
        }
        return null;
    }

    public final ar6.a b(k85 k85Var, Object obj, zk7 zk7Var, nm3 nm3Var) {
        String strA;
        Map map;
        ar6.a aVar = k85Var.e;
        List<eva> list = k85Var.i;
        if (aVar != null) {
            return aVar;
        }
        List<js7<fp5<? extends Object>, Class<? extends Object>>> list2 = this.a.g.c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                strA = null;
                break;
            }
            js7<fp5<? extends Object>, Class<? extends Object>> js7Var = list2.get(i);
            fp5<? extends Object> fp5Var = js7Var.t;
            if (js7Var.u.isAssignableFrom(obj.getClass())) {
                fp5Var.getClass();
                strA = fp5Var.a(obj, zk7Var);
                if (strA != null) {
                    break;
                }
            }
            i++;
        }
        if (strA == null) {
            return null;
        }
        Map<String, ys7.b> map2 = k85Var.A.t;
        if (map2.isEmpty()) {
            map = if3.t;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ys7.b> entry : map2.entrySet()) {
                String str = entry.getValue().b;
                if (str != null) {
                    linkedHashMap.put(entry.getKey(), str);
                }
            }
            map = linkedHashMap;
        }
        if (list.isEmpty() && map.isEmpty()) {
            return new ar6.a(strA);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        if (!list.isEmpty()) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedHashMap2.put(pp2.a(i2, "coil#transformation_"), list.get(i2).getCacheKey());
            }
            linkedHashMap2.put("coil#transformation_size", zk7Var.d.toString());
        }
        return new ar6.a(strA, linkedHashMap2);
    }
}
