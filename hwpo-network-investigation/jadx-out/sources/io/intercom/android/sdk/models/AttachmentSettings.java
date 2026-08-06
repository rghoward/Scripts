package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.fh0;
import defpackage.of3;
import defpackage.qq2;
import defpackage.uo2;
import defpackage.xj5;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AttachmentSettings {

    @SerializedName("conversation_camera_enabled")
    private final boolean cameraEnabled;

    @SerializedName("conversation_files_enabled")
    private final boolean filesEnabled;

    @SerializedName("conversation_gifs_enabled")
    private final boolean gifsEnabled;

    @SerializedName("conversation_media_enabled")
    private final boolean mediaEnabled;

    @SerializedName("file_upload_extension_trusted_list")
    private final Set<String> trustedFileExtensions;

    @SerializedName("upload_size_limit")
    private final long uploadSizeLimit;

    @SerializedName("conversation_voice_notes_enabled")
    private final boolean voiceNotesEnabled;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final long DEFAULT_UPLOAD_SIZE_LIMIT = 104857600;
    private static final AttachmentSettings DEFAULT = new AttachmentSettings(true, true, true, true, true, of3.t, DEFAULT_UPLOAD_SIZE_LIMIT);

    public AttachmentSettings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Set<String> set, long j) {
        set.getClass();
        this.cameraEnabled = z;
        this.mediaEnabled = z2;
        this.filesEnabled = z3;
        this.gifsEnabled = z4;
        this.voiceNotesEnabled = z5;
        this.trustedFileExtensions = set;
        this.uploadSizeLimit = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AttachmentSettings copy$default(AttachmentSettings attachmentSettings, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Set set, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = attachmentSettings.cameraEnabled;
        }
        if ((i & 2) != 0) {
            z2 = attachmentSettings.mediaEnabled;
        }
        if ((i & 4) != 0) {
            z3 = attachmentSettings.filesEnabled;
        }
        if ((i & 8) != 0) {
            z4 = attachmentSettings.gifsEnabled;
        }
        if ((i & 16) != 0) {
            z5 = attachmentSettings.voiceNotesEnabled;
        }
        if ((i & 32) != 0) {
            set = attachmentSettings.trustedFileExtensions;
        }
        if ((i & 64) != 0) {
            j = attachmentSettings.uploadSizeLimit;
        }
        long j2 = j;
        boolean z6 = z5;
        Set set2 = set;
        return attachmentSettings.copy(z, z2, z3, z4, z6, set2, j2);
    }

    public final boolean component1() {
        return this.cameraEnabled;
    }

    public final boolean component2() {
        return this.mediaEnabled;
    }

    public final boolean component3() {
        return this.filesEnabled;
    }

    public final boolean component4() {
        return this.gifsEnabled;
    }

    public final boolean component5() {
        return this.voiceNotesEnabled;
    }

    public final Set<String> component6() {
        return this.trustedFileExtensions;
    }

    public final long component7() {
        return this.uploadSizeLimit;
    }

    public final AttachmentSettings copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Set<String> set, long j) {
        set.getClass();
        return new AttachmentSettings(z, z2, z3, z4, z5, set, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentSettings)) {
            return false;
        }
        AttachmentSettings attachmentSettings = (AttachmentSettings) obj;
        return this.cameraEnabled == attachmentSettings.cameraEnabled && this.mediaEnabled == attachmentSettings.mediaEnabled && this.filesEnabled == attachmentSettings.filesEnabled && this.gifsEnabled == attachmentSettings.gifsEnabled && this.voiceNotesEnabled == attachmentSettings.voiceNotesEnabled && xj5.a(this.trustedFileExtensions, attachmentSettings.trustedFileExtensions) && this.uploadSizeLimit == attachmentSettings.uploadSizeLimit;
    }

    public final boolean getCameraEnabled() {
        return this.cameraEnabled;
    }

    public final boolean getFilesEnabled() {
        return this.filesEnabled;
    }

    public final boolean getGifsEnabled() {
        return this.gifsEnabled;
    }

    public final boolean getMediaEnabled() {
        return this.mediaEnabled;
    }

    public final Set<String> getTrustedFileExtensions() {
        return this.trustedFileExtensions;
    }

    public final long getUploadSizeLimit() {
        return this.uploadSizeLimit;
    }

    public final String getUploadSizeLimitMB() {
        return String.valueOf(this.uploadSizeLimit / 1048576);
    }

    public final boolean getVoiceNotesEnabled() {
        return this.voiceNotesEnabled;
    }

    public int hashCode() {
        return Long.hashCode(this.uploadSizeLimit) + ((this.trustedFileExtensions.hashCode() + uo2.a(uo2.a(uo2.a(uo2.a(Boolean.hashCode(this.cameraEnabled) * 31, this.mediaEnabled, 31), this.filesEnabled, 31), this.gifsEnabled, 31), this.voiceNotesEnabled, 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AttachmentSettings(cameraEnabled=");
        sb.append(this.cameraEnabled);
        sb.append(", mediaEnabled=");
        sb.append(this.mediaEnabled);
        sb.append(", filesEnabled=");
        sb.append(this.filesEnabled);
        sb.append(", gifsEnabled=");
        sb.append(this.gifsEnabled);
        sb.append(", voiceNotesEnabled=");
        sb.append(this.voiceNotesEnabled);
        sb.append(", trustedFileExtensions=");
        sb.append(this.trustedFileExtensions);
        sb.append(", uploadSizeLimit=");
        return fh0.b(sb, this.uploadSizeLimit, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final AttachmentSettings getDEFAULT() {
            return AttachmentSettings.DEFAULT;
        }

        private Companion() {
        }
    }
}
