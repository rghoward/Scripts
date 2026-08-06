package io.intercom.android.sdk.models;

import defpackage.ac4;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Participant extends Participant {
    private final Avatar getAvatar;
    private final String getEmail;
    private final String getId;
    private final String getName;
    private final String getType;
    private final Boolean isBot;

    public AutoValue_Participant(String str, String str2, String str3, String str4, Avatar avatar, Boolean bool) {
        if (str == null) {
            ac4.c("Null getId");
            throw null;
        }
        this.getId = str;
        if (str2 == null) {
            ac4.c("Null getName");
            throw null;
        }
        this.getName = str2;
        if (str3 == null) {
            ac4.c("Null getType");
            throw null;
        }
        this.getType = str3;
        if (str4 == null) {
            ac4.c("Null getEmail");
            throw null;
        }
        this.getEmail = str4;
        if (avatar == null) {
            ac4.c("Null getAvatar");
            throw null;
        }
        this.getAvatar = avatar;
        if (bool != null) {
            this.isBot = bool;
        } else {
            ac4.c("Null isBot");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Participant) {
            Participant participant = (Participant) obj;
            if (this.getId.equals(participant.getId()) && this.getName.equals(participant.getName()) && this.getType.equals(participant.getType()) && this.getEmail.equals(participant.getEmail()) && this.getAvatar.equals(participant.getAvatar()) && this.isBot.equals(participant.isBot())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Participant
    public Avatar getAvatar() {
        return this.getAvatar;
    }

    @Override // io.intercom.android.sdk.models.Participant
    public String getEmail() {
        return this.getEmail;
    }

    @Override // io.intercom.android.sdk.models.Participant
    public String getId() {
        return this.getId;
    }

    @Override // io.intercom.android.sdk.models.Participant
    public String getName() {
        return this.getName;
    }

    @Override // io.intercom.android.sdk.models.Participant
    public String getType() {
        return this.getType;
    }

    public int hashCode() {
        return this.isBot.hashCode() ^ ((((((((((this.getId.hashCode() ^ 1000003) * 1000003) ^ this.getName.hashCode()) * 1000003) ^ this.getType.hashCode()) * 1000003) ^ this.getEmail.hashCode()) * 1000003) ^ this.getAvatar.hashCode()) * 1000003);
    }

    @Override // io.intercom.android.sdk.models.Participant
    public Boolean isBot() {
        return this.isBot;
    }

    public String toString() {
        return "Participant{getId=" + this.getId + ", getName=" + this.getName + ", getType=" + this.getType + ", getEmail=" + this.getEmail + ", getAvatar=" + this.getAvatar + ", isBot=" + this.isBot + "}";
    }
}
