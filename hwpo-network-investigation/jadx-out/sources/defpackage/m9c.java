package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m9c {
    public static final m9c f = new m9c((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public m9c(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(lnc.class);
        this.e = enumMap;
        enumMap.put(lnc.AD_USER_DATA, bool == null ? hnc.UNINITIALIZED : bool.booleanValue() ? hnc.GRANTED : hnc.DENIED);
        this.a = i;
        this.b = d();
        this.c = bool2;
        this.d = str;
    }

    public static m9c b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(lnc.class);
        lnc[] lncVarArr = jnc.DMA.t;
        int length = lncVarArr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(lncVarArr[i3], nnc.e(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new m9c(enumMap, i, (Boolean) null, (String) null);
    }

    public static m9c c(int i, Bundle bundle) {
        if (bundle == null) {
            return new m9c((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(lnc.class);
        for (lnc lncVar : jnc.DMA.t) {
            enumMap.put(lncVar, nnc.d(bundle.getString(lncVar.t)));
        }
        return new m9c(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final hnc a() {
        hnc hncVar = (hnc) this.e.get(lnc.AD_USER_DATA);
        return hncVar == null ? hnc.UNINITIALIZED : hncVar;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (lnc lncVar : jnc.DMA.t) {
            sb.append(":");
            sb.append(nnc.h((hnc) this.e.get(lncVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m9c)) {
            return false;
        }
        m9c m9cVar = (m9c) obj;
        if (this.b.equalsIgnoreCase(m9cVar.b) && Objects.equals(this.c, m9cVar.c)) {
            return Objects.equals(this.d, m9cVar.d);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.c;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(nnc.a(this.a));
        for (lnc lncVar : jnc.DMA.t) {
            sb.append(",");
            sb.append(lncVar.t);
            sb.append("=");
            hnc hncVar = (hnc) this.e.get(lncVar);
            if (hncVar == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = hncVar.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public m9c(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(lnc.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = d();
        this.c = bool;
        this.d = str;
    }
}
