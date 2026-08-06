package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface lbc extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(obc obcVar);

    void getAppInstanceId(obc obcVar);

    void getCachedAppInstanceId(obc obcVar);

    void getConditionalUserProperties(String str, String str2, obc obcVar);

    void getCurrentScreenClass(obc obcVar);

    void getCurrentScreenName(obc obcVar);

    void getGmpAppId(obc obcVar);

    void getMaxUserProperties(String str, obc obcVar);

    void getSessionId(obc obcVar);

    void getTestFlag(obc obcVar, int i);

    void getUserProperties(String str, String str2, boolean z, obc obcVar);

    void initForTests(Map map);

    void initialize(y55 y55Var, jcc jccVar, long j);

    void initializeWithElapsedTime(y55 y55Var, jcc jccVar, long j, long j2);

    void isDataCollectionEnabled(obc obcVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, obc obcVar, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, y55 y55Var, y55 y55Var2, y55 y55Var3);

    void onActivityCreated(y55 y55Var, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(lcc lccVar, Bundle bundle, long j);

    void onActivityDestroyed(y55 y55Var, long j);

    void onActivityDestroyedByScionActivityInfo(lcc lccVar, long j);

    void onActivityPaused(y55 y55Var, long j);

    void onActivityPausedByScionActivityInfo(lcc lccVar, long j);

    void onActivityResumed(y55 y55Var, long j);

    void onActivityResumedByScionActivityInfo(lcc lccVar, long j);

    void onActivitySaveInstanceState(y55 y55Var, obc obcVar, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(lcc lccVar, obc obcVar, long j);

    void onActivityStarted(y55 y55Var, long j);

    void onActivityStartedByScionActivityInfo(lcc lccVar, long j);

    void onActivityStopped(y55 y55Var, long j);

    void onActivityStoppedByScionActivityInfo(lcc lccVar, long j);

    void performAction(Bundle bundle, obc obcVar, long j);

    void registerOnMeasurementEventListener(tbc tbcVar);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(qbc qbcVar);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(y55 y55Var, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(lcc lccVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(tbc tbcVar);

    void setInstanceIdProvider(icc iccVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, y55 y55Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(tbc tbcVar);
}
