package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jbc extends fac implements lbc {
    @Override // defpackage.lbc
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeLong(j);
        i(parcelG, 23);
    }

    @Override // defpackage.lbc
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        iac.b(parcelG, bundle);
        i(parcelG, 9);
    }

    @Override // defpackage.lbc
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeLong(j);
        i(parcelG, 24);
    }

    @Override // defpackage.lbc
    public final void generateEventId(obc obcVar) {
        Parcel parcelG = g();
        iac.c(parcelG, obcVar);
        i(parcelG, 22);
    }

    @Override // defpackage.lbc
    public final void getCachedAppInstanceId(obc obcVar) {
        Parcel parcelG = g();
        iac.c(parcelG, obcVar);
        i(parcelG, 19);
    }

    @Override // defpackage.lbc
    public final void getConditionalUserProperties(String str, String str2, obc obcVar) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        iac.c(parcelG, obcVar);
        i(parcelG, 10);
    }

    @Override // defpackage.lbc
    public final void getCurrentScreenClass(obc obcVar) {
        Parcel parcelG = g();
        iac.c(parcelG, obcVar);
        i(parcelG, 17);
    }

    @Override // defpackage.lbc
    public final void getCurrentScreenName(obc obcVar) {
        Parcel parcelG = g();
        iac.c(parcelG, obcVar);
        i(parcelG, 16);
    }

    @Override // defpackage.lbc
    public final void getGmpAppId(obc obcVar) {
        Parcel parcelG = g();
        iac.c(parcelG, obcVar);
        i(parcelG, 21);
    }

    @Override // defpackage.lbc
    public final void getMaxUserProperties(String str, obc obcVar) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        iac.c(parcelG, obcVar);
        i(parcelG, 6);
    }

    @Override // defpackage.lbc
    public final void getUserProperties(String str, String str2, boolean z, obc obcVar) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        ClassLoader classLoader = iac.a;
        parcelG.writeInt(z ? 1 : 0);
        iac.c(parcelG, obcVar);
        i(parcelG, 5);
    }

    @Override // defpackage.lbc
    public final void initialize(y55 y55Var, jcc jccVar, long j) {
        Parcel parcelG = g();
        iac.c(parcelG, y55Var);
        iac.b(parcelG, jccVar);
        parcelG.writeLong(j);
        i(parcelG, 1);
    }

    @Override // defpackage.lbc
    public final void initializeWithElapsedTime(y55 y55Var, jcc jccVar, long j, long j2) {
        Parcel parcelG = g();
        iac.c(parcelG, y55Var);
        iac.b(parcelG, jccVar);
        parcelG.writeLong(j);
        parcelG.writeLong(j2);
        i(parcelG, 60);
    }

    @Override // defpackage.lbc
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        iac.b(parcelG, bundle);
        parcelG.writeInt(1);
        parcelG.writeInt(1);
        parcelG.writeLong(j);
        parcelG.writeLong(j2);
        i(parcelG, 59);
    }

    @Override // defpackage.lbc
    public final void logHealthData(int i, String str, y55 y55Var, y55 y55Var2, y55 y55Var3) {
        Parcel parcelG = g();
        parcelG.writeInt(5);
        parcelG.writeString("Error with data collection. Data lost.");
        iac.c(parcelG, y55Var);
        iac.c(parcelG, y55Var2);
        iac.c(parcelG, y55Var3);
        i(parcelG, 33);
    }

    @Override // defpackage.lbc
    public final void onActivityCreatedByScionActivityInfo(lcc lccVar, Bundle bundle, long j) {
        Parcel parcelG = g();
        iac.b(parcelG, lccVar);
        iac.b(parcelG, bundle);
        parcelG.writeLong(j);
        i(parcelG, 53);
    }

    @Override // defpackage.lbc
    public final void onActivityDestroyedByScionActivityInfo(lcc lccVar, long j) {
        Parcel parcelG = g();
        iac.b(parcelG, lccVar);
        parcelG.writeLong(j);
        i(parcelG, 54);
    }

    @Override // defpackage.lbc
    public final void onActivityPausedByScionActivityInfo(lcc lccVar, long j) {
        Parcel parcelG = g();
        iac.b(parcelG, lccVar);
        parcelG.writeLong(j);
        i(parcelG, 55);
    }

    @Override // defpackage.lbc
    public final void onActivityResumedByScionActivityInfo(lcc lccVar, long j) {
        Parcel parcelG = g();
        iac.b(parcelG, lccVar);
        parcelG.writeLong(j);
        i(parcelG, 56);
    }

    @Override // defpackage.lbc
    public final void onActivitySaveInstanceStateByScionActivityInfo(lcc lccVar, obc obcVar, long j) {
        Parcel parcelG = g();
        iac.b(parcelG, lccVar);
        iac.c(parcelG, obcVar);
        parcelG.writeLong(j);
        i(parcelG, 57);
    }

    @Override // defpackage.lbc
    public final void onActivityStartedByScionActivityInfo(lcc lccVar, long j) {
        Parcel parcelG = g();
        iac.b(parcelG, lccVar);
        parcelG.writeLong(j);
        i(parcelG, 51);
    }

    @Override // defpackage.lbc
    public final void onActivityStoppedByScionActivityInfo(lcc lccVar, long j) {
        Parcel parcelG = g();
        iac.b(parcelG, lccVar);
        parcelG.writeLong(j);
        i(parcelG, 52);
    }

    @Override // defpackage.lbc
    public final void registerOnMeasurementEventListener(tbc tbcVar) {
        Parcel parcelG = g();
        iac.c(parcelG, tbcVar);
        i(parcelG, 35);
    }

    @Override // defpackage.lbc
    public final void retrieveAndUploadBatches(qbc qbcVar) {
        Parcel parcelG = g();
        iac.c(parcelG, qbcVar);
        i(parcelG, 58);
    }

    @Override // defpackage.lbc
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelG = g();
        iac.b(parcelG, bundle);
        parcelG.writeLong(j);
        i(parcelG, 8);
    }

    @Override // defpackage.lbc
    public final void setCurrentScreenByScionActivityInfo(lcc lccVar, String str, String str2, long j) {
        Parcel parcelG = g();
        iac.b(parcelG, lccVar);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeLong(j);
        i(parcelG, 50);
    }

    @Override // defpackage.lbc
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.lbc
    public final void setUserProperty(String str, String str2, y55 y55Var, boolean z, long j) {
        Parcel parcelG = g();
        parcelG.writeString("fcm");
        parcelG.writeString("_ln");
        iac.c(parcelG, y55Var);
        parcelG.writeInt(1);
        parcelG.writeLong(j);
        i(parcelG, 4);
    }
}
