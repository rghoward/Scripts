package com.hwpo_training_app.tracking.data.entity;

import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.UnitsNetworkEntity;
import defpackage.f93;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.il;
import defpackage.j26;
import defpackage.m2b;
import defpackage.ph1;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.ss5;
import defpackage.uk3;
import defpackage.xj3;
import defpackage.xj5;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@rd9
public final class EntryDetailsNetworkEntity implements f93<xj3> {
    public final List<SectionAttachmentNetworkEntity> A;
    public final int t;
    public final String u;
    public final String v;
    public final double w;
    public final Double x;
    public final String y;
    public final UnitsNetworkEntity z;
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] B = {null, null, null, null, null, null, null, hv5.c(j26.t, new uk3())};

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<EntryDetailsNetworkEntity> serializer() {
            return EntryDetailsNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EntryDetailsNetworkEntity(int i, int i2, String str, String str2, double d, Double d2, String str3, UnitsNetworkEntity unitsNetworkEntity, List list) {
        if (237 != (i & 237)) {
            hl3.b(i, 237, EntryDetailsNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = i2;
        if ((i & 2) == 0) {
            this.u = null;
        } else {
            this.u = str;
        }
        this.v = str2;
        this.w = d;
        if ((i & 16) == 0) {
            this.x = null;
        } else {
            this.x = d2;
        }
        this.y = str3;
        this.z = unitsNetworkEntity;
        this.A = list;
    }

    @Override // defpackage.f93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final xj3 a() {
        LocalDate localDate = LocalDate.parse(this.v);
        localDate.getClass();
        m2b m2bVarA = this.z.a();
        List<SectionAttachmentNetworkEntity> list = this.A;
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SectionAttachmentNetworkEntity) it.next()).a());
        }
        return new xj3(this.t, this.u, localDate, this.w, this.x, this.y, m2bVarA, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryDetailsNetworkEntity)) {
            return false;
        }
        EntryDetailsNetworkEntity entryDetailsNetworkEntity = (EntryDetailsNetworkEntity) obj;
        return this.t == entryDetailsNetworkEntity.t && xj5.a(this.u, entryDetailsNetworkEntity.u) && xj5.a(this.v, entryDetailsNetworkEntity.v) && Double.compare(this.w, entryDetailsNetworkEntity.w) == 0 && xj5.a(this.x, entryDetailsNetworkEntity.x) && xj5.a(this.y, entryDetailsNetworkEntity.y) && this.z == entryDetailsNetworkEntity.z && xj5.a(this.A, entryDetailsNetworkEntity.A);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.t) * 31;
        String str = this.u;
        int iHashCode2 = (Double.hashCode(this.w) + ru3.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.v)) * 31;
        Double d = this.x;
        return this.A.hashCode() + ((this.z.hashCode() + ru3.c((iHashCode2 + (d != null ? d.hashCode() : 0)) * 31, 31, this.y)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("EntryDetailsNetworkEntity(id=", ", note=", this.u, ", date=", this.t);
        sbA.append(this.v);
        sbA.append(", value=");
        sbA.append(this.w);
        sbA.append(", secondValue=");
        sbA.append(this.x);
        sbA.append(", symbol=");
        sbA.append(this.y);
        sbA.append(", units=");
        sbA.append(this.z);
        sbA.append(", attachments=");
        sbA.append(this.A);
        sbA.append(")");
        return sbA.toString();
    }
}
