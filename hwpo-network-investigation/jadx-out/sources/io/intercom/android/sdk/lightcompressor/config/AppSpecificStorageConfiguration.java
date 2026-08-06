package io.intercom.android.sdk.lightcompressor.config;

import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppSpecificStorageConfiguration {
    private String subFolderName;

    public /* synthetic */ AppSpecificStorageConfiguration(String str, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ AppSpecificStorageConfiguration copy$default(AppSpecificStorageConfiguration appSpecificStorageConfiguration, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appSpecificStorageConfiguration.subFolderName;
        }
        return appSpecificStorageConfiguration.copy(str);
    }

    public final String component1() {
        return this.subFolderName;
    }

    public final AppSpecificStorageConfiguration copy(String str) {
        return new AppSpecificStorageConfiguration(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppSpecificStorageConfiguration) && xj5.a(this.subFolderName, ((AppSpecificStorageConfiguration) obj).subFolderName);
    }

    public final String getSubFolderName() {
        return this.subFolderName;
    }

    public int hashCode() {
        String str = this.subFolderName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setSubFolderName(String str) {
        this.subFolderName = str;
    }

    public String toString() {
        return wu0.a(new StringBuilder("AppSpecificStorageConfiguration(subFolderName="), this.subFolderName, ')');
    }

    public AppSpecificStorageConfiguration(String str) {
        this.subFolderName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppSpecificStorageConfiguration() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
