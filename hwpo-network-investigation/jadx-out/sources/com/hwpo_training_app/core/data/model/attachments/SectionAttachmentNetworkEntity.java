package com.hwpo_training_app.core.data.model.attachments;

import defpackage.f93;
import defpackage.hl3;
import defpackage.hv5;
import defpackage.ik1;
import defpackage.j26;
import defpackage.m89;
import defpackage.rd9;
import defpackage.ru3;
import defpackage.ss5;
import defpackage.ux1;
import defpackage.xj5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@rd9
public final class SectionAttachmentNetworkEntity implements f93<m89> {
    public static final Companion Companion = new Companion();
    public static final ss5<KSerializer<Object>>[] F = {null, null, null, null, null, null, null, null, null, hv5.c(j26.t, new ik1(1)), null, null};
    public final String A;
    public final Integer B;
    public final AttachmentTypeNetworkEntity C;
    public final String D;
    public final Long E;
    public final long t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public final KSerializer<SectionAttachmentNetworkEntity> serializer() {
            return SectionAttachmentNetworkEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SectionAttachmentNetworkEntity(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, AttachmentTypeNetworkEntity attachmentTypeNetworkEntity, String str8, Long l) {
        if (3695 != (i & 3695)) {
            hl3.b(i, 3695, SectionAttachmentNetworkEntity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.t = j;
        this.u = str;
        this.v = str2;
        this.w = str3;
        if ((i & 16) == 0) {
            this.x = null;
        } else {
            this.x = str4;
        }
        this.y = str5;
        this.z = str6;
        if ((i & 128) == 0) {
            this.A = null;
        } else {
            this.A = str7;
        }
        if ((i & 256) == 0) {
            this.B = null;
        } else {
            this.B = num;
        }
        this.C = attachmentTypeNetworkEntity;
        this.D = str8;
        this.E = l;
    }

    @Override // defpackage.f93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m89 a() {
        return new m89(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C.a(), this.D, this.E, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionAttachmentNetworkEntity)) {
            return false;
        }
        SectionAttachmentNetworkEntity sectionAttachmentNetworkEntity = (SectionAttachmentNetworkEntity) obj;
        return this.t == sectionAttachmentNetworkEntity.t && xj5.a(this.u, sectionAttachmentNetworkEntity.u) && xj5.a(this.v, sectionAttachmentNetworkEntity.v) && xj5.a(this.w, sectionAttachmentNetworkEntity.w) && xj5.a(this.x, sectionAttachmentNetworkEntity.x) && xj5.a(this.y, sectionAttachmentNetworkEntity.y) && xj5.a(this.z, sectionAttachmentNetworkEntity.z) && xj5.a(this.A, sectionAttachmentNetworkEntity.A) && xj5.a(this.B, sectionAttachmentNetworkEntity.B) && this.C == sectionAttachmentNetworkEntity.C && xj5.a(this.D, sectionAttachmentNetworkEntity.D) && xj5.a(this.E, sectionAttachmentNetworkEntity.E);
    }

    public final int hashCode() {
        int iC = ru3.c(ru3.c(Long.hashCode(this.t) * 31, 31, this.u), 31, this.v);
        String str = this.w;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.x;
        int iC2 = ru3.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.y);
        String str3 = this.z;
        int iHashCode2 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.B;
        int iHashCode4 = (this.C.hashCode() + ((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str5 = this.D;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.E;
        return iHashCode5 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionAttachmentNetworkEntity(id=");
        sb.append(this.t);
        sb.append(", title=");
        sb.append(this.u);
        ux1.b(sb, ", sourceUrl=", this.v, ", thumbnailUrl=", this.w);
        ux1.b(sb, ", mediumThumbnailUrl=", this.x, ", contentType=", this.y);
        ux1.b(sb, ", streamSource=", this.z, ", youtubeVideoId=", this.A);
        sb.append(", position=");
        sb.append(this.B);
        sb.append(", type=");
        sb.append(this.C);
        sb.append(", fileSize=");
        sb.append(this.D);
        sb.append(", fileSizeInBytes=");
        sb.append(this.E);
        sb.append(")");
        return sb.toString();
    }
}
