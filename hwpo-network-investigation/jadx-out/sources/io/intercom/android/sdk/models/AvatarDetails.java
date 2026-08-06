package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.xj5;
import defpackage.zc6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AvatarDetails {
    public static final int $stable = 8;

    @SerializedName("avatar_type")
    private final AvatarType avatarType;

    @SerializedName("avatars")
    private final List<Avatar.Builder> avatars;

    public AvatarDetails(AvatarType avatarType, List<Avatar.Builder> list) {
        avatarType.getClass();
        list.getClass();
        this.avatarType = avatarType;
        this.avatars = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvatarDetails copy$default(AvatarDetails avatarDetails, AvatarType avatarType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            avatarType = avatarDetails.avatarType;
        }
        if ((i & 2) != 0) {
            list = avatarDetails.avatars;
        }
        return avatarDetails.copy(avatarType, list);
    }

    public final AvatarType component1() {
        return this.avatarType;
    }

    public final List<Avatar.Builder> component2() {
        return this.avatars;
    }

    public final AvatarDetails copy(AvatarType avatarType, List<Avatar.Builder> list) {
        avatarType.getClass();
        list.getClass();
        return new AvatarDetails(avatarType, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarDetails)) {
            return false;
        }
        AvatarDetails avatarDetails = (AvatarDetails) obj;
        return this.avatarType == avatarDetails.avatarType && xj5.a(this.avatars, avatarDetails.avatars);
    }

    public final AvatarType getAvatarType() {
        return this.avatarType;
    }

    public final List<Avatar.Builder> getAvatars() {
        return this.avatars;
    }

    public int hashCode() {
        return this.avatars.hashCode() + (this.avatarType.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AvatarDetails(avatarType=");
        sb.append(this.avatarType);
        sb.append(", avatars=");
        return zc6.a(sb, this.avatars, ')');
    }
}
