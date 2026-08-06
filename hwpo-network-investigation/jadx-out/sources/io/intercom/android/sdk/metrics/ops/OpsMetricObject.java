package io.intercom.android.sdk.metrics.ops;

import defpackage.av;
import defpackage.ru3;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class OpsMetricObject {
    private final String id;
    private final String name;
    private final String type;
    private final long value;

    public OpsMetricObject(String str, String str2, long j, String str3) {
        this.type = str;
        this.name = str2;
        this.value = j;
        this.id = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsMetricObject opsMetricObject = (OpsMetricObject) obj;
        if (this.value == opsMetricObject.value && this.type.equals(opsMetricObject.type) && this.name.equals(opsMetricObject.name)) {
            return this.id.equals(opsMetricObject.id);
        }
        return false;
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        int iC = ru3.c(this.type.hashCode() * 31, 31, this.name);
        long j = this.value;
        return this.id.hashCode() + ((iC + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OpsMetricObject{type='");
        sb.append(this.type);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', value=");
        sb.append(this.value);
        sb.append(", id='");
        return av.a(sb, this.id, "'}");
    }
}
