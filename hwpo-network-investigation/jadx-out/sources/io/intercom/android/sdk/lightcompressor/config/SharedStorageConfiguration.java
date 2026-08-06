package io.intercom.android.sdk.lightcompressor.config;

import defpackage.qq2;
import defpackage.wu0;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedStorageConfiguration {
    private SaveLocation saveAt;
    private String subFolderName;

    public /* synthetic */ SharedStorageConfiguration(SaveLocation saveLocation, String str, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? null : saveLocation, (i & 2) != 0 ? null : str);
    }

    public static /* synthetic */ SharedStorageConfiguration copy$default(SharedStorageConfiguration sharedStorageConfiguration, SaveLocation saveLocation, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            saveLocation = sharedStorageConfiguration.saveAt;
        }
        if ((i & 2) != 0) {
            str = sharedStorageConfiguration.subFolderName;
        }
        return sharedStorageConfiguration.copy(saveLocation, str);
    }

    public final SaveLocation component1() {
        return this.saveAt;
    }

    public final String component2() {
        return this.subFolderName;
    }

    public final SharedStorageConfiguration copy(SaveLocation saveLocation, String str) {
        return new SharedStorageConfiguration(saveLocation, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedStorageConfiguration)) {
            return false;
        }
        SharedStorageConfiguration sharedStorageConfiguration = (SharedStorageConfiguration) obj;
        return this.saveAt == sharedStorageConfiguration.saveAt && xj5.a(this.subFolderName, sharedStorageConfiguration.subFolderName);
    }

    public final SaveLocation getSaveAt() {
        return this.saveAt;
    }

    public final String getSubFolderName() {
        return this.subFolderName;
    }

    public int hashCode() {
        SaveLocation saveLocation = this.saveAt;
        int iHashCode = (saveLocation == null ? 0 : saveLocation.hashCode()) * 31;
        String str = this.subFolderName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setSaveAt(SaveLocation saveLocation) {
        this.saveAt = saveLocation;
    }

    public final void setSubFolderName(String str) {
        this.subFolderName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SharedStorageConfiguration(saveAt=");
        sb.append(this.saveAt);
        sb.append(", subFolderName=");
        return wu0.a(sb, this.subFolderName, ')');
    }

    public SharedStorageConfiguration(SaveLocation saveLocation, String str) {
        this.saveAt = saveLocation;
        this.subFolderName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SharedStorageConfiguration() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
