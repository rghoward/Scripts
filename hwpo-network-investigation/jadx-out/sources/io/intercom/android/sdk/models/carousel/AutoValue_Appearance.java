package io.intercom.android.sdk.models.carousel;

import defpackage.ac4;
import defpackage.av;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Appearance extends Appearance {
    private final String alignment;
    private final String textColor;
    private final String type;

    public AutoValue_Appearance(String str, String str2, String str3) {
        if (str == null) {
            ac4.c("Null type");
            throw null;
        }
        this.type = str;
        if (str2 == null) {
            ac4.c("Null alignment");
            throw null;
        }
        this.alignment = str2;
        if (str3 != null) {
            this.textColor = str3;
        } else {
            ac4.c("Null textColor");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Appearance) {
            Appearance appearance = (Appearance) obj;
            if (this.type.equals(appearance.getType()) && this.alignment.equals(appearance.getAlignment()) && this.textColor.equals(appearance.getTextColor())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.carousel.Appearance
    public String getAlignment() {
        return this.alignment;
    }

    @Override // io.intercom.android.sdk.models.carousel.Appearance
    public String getTextColor() {
        return this.textColor;
    }

    @Override // io.intercom.android.sdk.models.carousel.Appearance
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.textColor.hashCode() ^ ((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.alignment.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Appearance{type=");
        sb.append(this.type);
        sb.append(", alignment=");
        sb.append(this.alignment);
        sb.append(", textColor=");
        return av.a(sb, this.textColor, "}");
    }
}
