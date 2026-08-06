package defpackage;

import android.os.Bundle;
import com.intercom.twig.BuildConfig;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nnc {
    public static final nnc c = new nnc(100);
    public final EnumMap a;
    public final int b;

    public nnc(int i) {
        EnumMap enumMap = new EnumMap(lnc.class);
        this.a = enumMap;
        lnc lncVar = lnc.AD_STORAGE;
        hnc hncVar = hnc.UNINITIALIZED;
        enumMap.put(lncVar, hncVar);
        enumMap.put(lnc.ANALYTICS_STORAGE, hncVar);
        this.b = i;
    }

    public static String a(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static nnc b(int i, Bundle bundle) {
        if (bundle == null) {
            return new nnc(i);
        }
        EnumMap enumMap = new EnumMap(lnc.class);
        for (lnc lncVar : jnc.STORAGE.t) {
            enumMap.put(lncVar, d(bundle.getString(lncVar.t)));
        }
        return new nnc(enumMap, i);
    }

    public static nnc c(int i, String str) {
        EnumMap enumMap = new EnumMap(lnc.class);
        lnc[] lncVarArr = jnc.STORAGE.t;
        for (int i2 = 0; i2 < lncVarArr.length; i2++) {
            String str2 = str == null ? BuildConfig.FLAVOR : str;
            lnc lncVar = lncVarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(lncVar, e(str2.charAt(i3)));
            } else {
                enumMap.put(lncVar, hnc.UNINITIALIZED);
            }
        }
        return new nnc(enumMap, i);
    }

    public static hnc d(String str) {
        hnc hncVar = hnc.UNINITIALIZED;
        if (str == null) {
            return hncVar;
        }
        if (str.equals("granted")) {
            return hnc.GRANTED;
        }
        return str.equals("denied") ? hnc.DENIED : hncVar;
    }

    public static hnc e(char c2) {
        if (c2 == '+') {
            return hnc.POLICY;
        }
        if (c2 != '0') {
            return c2 != '1' ? hnc.UNINITIALIZED : hnc.GRANTED;
        }
        return hnc.DENIED;
    }

    public static char h(hnc hncVar) {
        if (hncVar == null) {
            return '-';
        }
        int iOrdinal = hncVar.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nnc) {
            nnc nncVar = (nnc) obj;
            for (lnc lncVar : jnc.STORAGE.t) {
                if (this.a.get(lncVar) == nncVar.a.get(lncVar)) {
                }
            }
            if (this.b == nncVar.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    public final String f() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (lnc lncVar : jnc.STORAGE.t) {
            hnc hncVar = (hnc) this.a.get(lncVar);
            char c2 = '-';
            if (hncVar != null && (iOrdinal = hncVar.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c2 = '1';
                } else if (iOrdinal == 2) {
                    c2 = '0';
                } else if (iOrdinal == 3) {
                    c2 = '1';
                }
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (lnc lncVar : jnc.STORAGE.t) {
            sb.append(h((hnc) this.a.get(lncVar)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int iHashCode = this.b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((hnc) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(lnc lncVar) {
        return ((hnc) this.a.get(lncVar)) != hnc.DENIED;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public final nnc j(nnc nncVar) {
        EnumMap enumMap = new EnumMap(lnc.class);
        for (lnc lncVar : jnc.STORAGE.t) {
            hnc hncVar = (hnc) this.a.get(lncVar);
            hnc hncVar2 = (hnc) nncVar.a.get(lncVar);
            if (hncVar == null) {
                hncVar = hncVar2;
            } else if (hncVar2 != null) {
                hnc hncVar3 = hnc.UNINITIALIZED;
                if (hncVar == hncVar3) {
                    hncVar = hncVar2;
                } else if (hncVar2 != hncVar3) {
                    hnc hncVar4 = hnc.POLICY;
                    if (hncVar == hncVar4) {
                        hncVar = hncVar2;
                    } else if (hncVar2 != hncVar4) {
                        hnc hncVar5 = hnc.DENIED;
                        hncVar = (hncVar == hncVar5 || hncVar2 == hncVar5) ? hncVar5 : hnc.GRANTED;
                    }
                }
            }
            if (hncVar != null) {
                enumMap.put(lncVar, hncVar);
            }
        }
        return new nnc(enumMap, 100);
    }

    public final nnc k(nnc nncVar) {
        EnumMap enumMap = new EnumMap(lnc.class);
        for (lnc lncVar : jnc.STORAGE.t) {
            hnc hncVar = (hnc) this.a.get(lncVar);
            if (hncVar == hnc.UNINITIALIZED) {
                hncVar = (hnc) nncVar.a.get(lncVar);
            }
            if (hncVar != null) {
                enumMap.put(lncVar, hncVar);
            }
        }
        return new nnc(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (lnc lncVar : jnc.STORAGE.t) {
            sb.append(",");
            sb.append(lncVar.t);
            sb.append("=");
            hnc hncVar = (hnc) this.a.get(lncVar);
            if (hncVar == null) {
                hncVar = hnc.UNINITIALIZED;
            }
            sb.append(hncVar);
        }
        return sb.toString();
    }

    public nnc(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(lnc.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
