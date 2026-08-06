package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kbc extends gac implements lbc {
    public kbc() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static lbc asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof lbc ? (lbc) iInterfaceQueryLocalInterface : new jbc(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // defpackage.gac
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        obc mbcVar = null;
        qbc pbcVar = null;
        obc mbcVar2 = null;
        obc mbcVar3 = null;
        obc mbcVar4 = null;
        obc mbcVar5 = null;
        tbc rbcVar = null;
        tbc rbcVar2 = null;
        tbc rbcVar3 = null;
        obc mbcVar6 = null;
        obc mbcVar7 = null;
        obc mbcVar8 = null;
        obc mbcVar9 = null;
        obc mbcVar10 = null;
        obc mbcVar11 = null;
        icc ubcVar = null;
        obc mbcVar12 = null;
        obc mbcVar13 = null;
        obc mbcVar14 = null;
        obc mbcVar15 = null;
        obc mbcVar16 = null;
        switch (i) {
            case 1:
                y55 y55VarG = y55.a.g(parcel.readStrongBinder());
                jcc jccVar = (jcc) iac.a(parcel, jcc.CREATOR);
                long j = parcel.readLong();
                iac.d(parcel);
                initialize(y55VarG, jccVar, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) iac.a(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                iac.d(parcel);
                logEvent(string, string2, bundle, z2, z3, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) iac.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar = iInterfaceQueryLocalInterface instanceof obc ? (obc) iInterfaceQueryLocalInterface : new mbc(strongBinder);
                }
                obc obcVar = mbcVar;
                long j3 = parcel.readLong();
                iac.d(parcel);
                logEventAndBundle(string3, string4, bundle2, obcVar, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                y55 y55VarG2 = y55.a.g(parcel.readStrongBinder());
                ClassLoader classLoader = iac.a;
                z = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                iac.d(parcel);
                setUserProperty(string5, string6, y55VarG2, z, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = iac.a;
                z = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar16 = iInterfaceQueryLocalInterface2 instanceof obc ? (obc) iInterfaceQueryLocalInterface2 : new mbc(strongBinder2);
                }
                iac.d(parcel);
                getUserProperties(string7, string8, z, mbcVar16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar15 = iInterfaceQueryLocalInterface3 instanceof obc ? (obc) iInterfaceQueryLocalInterface3 : new mbc(strongBinder3);
                }
                iac.d(parcel);
                getMaxUserProperties(string9, mbcVar15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                iac.d(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) iac.a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                iac.d(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) iac.a(parcel, Bundle.CREATOR);
                iac.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar14 = iInterfaceQueryLocalInterface4 instanceof obc ? (obc) iInterfaceQueryLocalInterface4 : new mbc(strongBinder4);
                }
                iac.d(parcel);
                getConditionalUserProperties(string13, string14, mbcVar14);
                break;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ClassLoader classLoader3 = iac.a;
                z = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                iac.d(parcel);
                setMeasurementEnabled(z, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                iac.d(parcel);
                resetAnalyticsData(j8);
                break;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                long j9 = parcel.readLong();
                iac.d(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                iac.d(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case h4c.e /* 15 */:
                y55 y55VarG3 = y55.a.g(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                iac.d(parcel);
                setCurrentScreen(y55VarG3, string15, string16, j11);
                break;
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar13 = iInterfaceQueryLocalInterface5 instanceof obc ? (obc) iInterfaceQueryLocalInterface5 : new mbc(strongBinder5);
                }
                iac.d(parcel);
                getCurrentScreenName(mbcVar13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar12 = iInterfaceQueryLocalInterface6 instanceof obc ? (obc) iInterfaceQueryLocalInterface6 : new mbc(strongBinder6);
                }
                iac.d(parcel);
                getCurrentScreenClass(mbcVar12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    ubcVar = iInterfaceQueryLocalInterface7 instanceof icc ? (icc) iInterfaceQueryLocalInterface7 : new ubc(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider");
                }
                iac.d(parcel);
                setInstanceIdProvider(ubcVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar11 = iInterfaceQueryLocalInterface8 instanceof obc ? (obc) iInterfaceQueryLocalInterface8 : new mbc(strongBinder8);
                }
                iac.d(parcel);
                getCachedAppInstanceId(mbcVar11);
                break;
            case InboxPagingSource.PAGE_SIZE /* 20 */:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar10 = iInterfaceQueryLocalInterface9 instanceof obc ? (obc) iInterfaceQueryLocalInterface9 : new mbc(strongBinder9);
                }
                iac.d(parcel);
                getAppInstanceId(mbcVar10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar9 = iInterfaceQueryLocalInterface10 instanceof obc ? (obc) iInterfaceQueryLocalInterface10 : new mbc(strongBinder10);
                }
                iac.d(parcel);
                getGmpAppId(mbcVar9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar8 = iInterfaceQueryLocalInterface11 instanceof obc ? (obc) iInterfaceQueryLocalInterface11 : new mbc(strongBinder11);
                }
                iac.d(parcel);
                generateEventId(mbcVar8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                iac.d(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                iac.d(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                y55 y55VarG4 = y55.a.g(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                iac.d(parcel);
                onActivityStarted(y55VarG4, j14);
                break;
            case 26:
                y55 y55VarG5 = y55.a.g(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                iac.d(parcel);
                onActivityStopped(y55VarG5, j15);
                break;
            case 27:
                y55 y55VarG6 = y55.a.g(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) iac.a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                iac.d(parcel);
                onActivityCreated(y55VarG6, bundle5, j16);
                break;
            case 28:
                y55 y55VarG7 = y55.a.g(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                iac.d(parcel);
                onActivityDestroyed(y55VarG7, j17);
                break;
            case 29:
                y55 y55VarG8 = y55.a.g(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                iac.d(parcel);
                onActivityPaused(y55VarG8, j18);
                break;
            case 30:
                y55 y55VarG9 = y55.a.g(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                iac.d(parcel);
                onActivityResumed(y55VarG9, j19);
                break;
            case 31:
                y55 y55VarG10 = y55.a.g(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar7 = iInterfaceQueryLocalInterface12 instanceof obc ? (obc) iInterfaceQueryLocalInterface12 : new mbc(strongBinder12);
                }
                long j20 = parcel.readLong();
                iac.d(parcel);
                onActivitySaveInstanceState(y55VarG10, mbcVar7, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) iac.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar6 = iInterfaceQueryLocalInterface13 instanceof obc ? (obc) iInterfaceQueryLocalInterface13 : new mbc(strongBinder13);
                }
                long j21 = parcel.readLong();
                iac.d(parcel);
                performAction(bundle6, mbcVar6, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                y55 y55VarG11 = y55.a.g(parcel.readStrongBinder());
                y55 y55VarG12 = y55.a.g(parcel.readStrongBinder());
                y55 y55VarG13 = y55.a.g(parcel.readStrongBinder());
                iac.d(parcel);
                logHealthData(i2, string19, y55VarG11, y55VarG12, y55VarG13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    rbcVar3 = iInterfaceQueryLocalInterface14 instanceof tbc ? (tbc) iInterfaceQueryLocalInterface14 : new rbc(strongBinder14);
                }
                iac.d(parcel);
                setEventInterceptor(rbcVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    rbcVar2 = iInterfaceQueryLocalInterface15 instanceof tbc ? (tbc) iInterfaceQueryLocalInterface15 : new rbc(strongBinder15);
                }
                iac.d(parcel);
                registerOnMeasurementEventListener(rbcVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    rbcVar = iInterfaceQueryLocalInterface16 instanceof tbc ? (tbc) iInterfaceQueryLocalInterface16 : new rbc(strongBinder16);
                }
                iac.d(parcel);
                unregisterOnMeasurementEventListener(rbcVar);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(iac.a);
                iac.d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar5 = iInterfaceQueryLocalInterface17 instanceof obc ? (obc) iInterfaceQueryLocalInterface17 : new mbc(strongBinder17);
                }
                int i3 = parcel.readInt();
                iac.d(parcel);
                getTestFlag(mbcVar5, i3);
                break;
            case 39:
                ClassLoader classLoader4 = iac.a;
                z = parcel.readInt() != 0;
                iac.d(parcel);
                setDataCollectionEnabled(z);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar4 = iInterfaceQueryLocalInterface18 instanceof obc ? (obc) iInterfaceQueryLocalInterface18 : new mbc(strongBinder18);
                }
                iac.d(parcel);
                isDataCollectionEnabled(mbcVar4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) iac.a(parcel, Bundle.CREATOR);
                iac.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                iac.d(parcel);
                clearMeasurementEnabled(j22);
                break;
            case Carousel.ENTITY_TYPE /* 44 */:
                Bundle bundle8 = (Bundle) iac.a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                iac.d(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) iac.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                iac.d(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar3 = iInterfaceQueryLocalInterface19 instanceof obc ? (obc) iInterfaceQueryLocalInterface19 : new mbc(strongBinder19);
                }
                iac.d(parcel);
                getSessionId(mbcVar3);
                break;
            case 48:
                Intent intent = (Intent) iac.a(parcel, Intent.CREATOR);
                iac.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                lcc lccVar = (lcc) iac.a(parcel, lcc.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                iac.d(parcel);
                setCurrentScreenByScionActivityInfo(lccVar, string20, string21, j25);
                break;
            case 51:
                lcc lccVar2 = (lcc) iac.a(parcel, lcc.CREATOR);
                long j26 = parcel.readLong();
                iac.d(parcel);
                onActivityStartedByScionActivityInfo(lccVar2, j26);
                break;
            case 52:
                lcc lccVar3 = (lcc) iac.a(parcel, lcc.CREATOR);
                long j27 = parcel.readLong();
                iac.d(parcel);
                onActivityStoppedByScionActivityInfo(lccVar3, j27);
                break;
            case 53:
                lcc lccVar4 = (lcc) iac.a(parcel, lcc.CREATOR);
                Bundle bundle10 = (Bundle) iac.a(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                iac.d(parcel);
                onActivityCreatedByScionActivityInfo(lccVar4, bundle10, j28);
                break;
            case 54:
                lcc lccVar5 = (lcc) iac.a(parcel, lcc.CREATOR);
                long j29 = parcel.readLong();
                iac.d(parcel);
                onActivityDestroyedByScionActivityInfo(lccVar5, j29);
                break;
            case 55:
                lcc lccVar6 = (lcc) iac.a(parcel, lcc.CREATOR);
                long j30 = parcel.readLong();
                iac.d(parcel);
                onActivityPausedByScionActivityInfo(lccVar6, j30);
                break;
            case 56:
                lcc lccVar7 = (lcc) iac.a(parcel, lcc.CREATOR);
                long j31 = parcel.readLong();
                iac.d(parcel);
                onActivityResumedByScionActivityInfo(lccVar7, j31);
                break;
            case 57:
                lcc lccVar8 = (lcc) iac.a(parcel, lcc.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    mbcVar2 = iInterfaceQueryLocalInterface20 instanceof obc ? (obc) iInterfaceQueryLocalInterface20 : new mbc(strongBinder20);
                }
                long j32 = parcel.readLong();
                iac.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(lccVar8, mbcVar2, j32);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    pbcVar = iInterfaceQueryLocalInterface21 instanceof qbc ? (qbc) iInterfaceQueryLocalInterface21 : new pbc(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                }
                iac.d(parcel);
                retrieveAndUploadBatches(pbcVar);
                break;
            case 59:
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                Bundle bundle11 = (Bundle) iac.a(parcel, Bundle.CREATOR);
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                long j33 = parcel.readLong();
                long j34 = parcel.readLong();
                iac.d(parcel);
                logEventWithElapsedTime(string22, string23, bundle11, z4, z5, j33, j34);
                break;
            case 60:
                y55 y55VarG14 = y55.a.g(parcel.readStrongBinder());
                jcc jccVar2 = (jcc) iac.a(parcel, jcc.CREATOR);
                long j35 = parcel.readLong();
                long j36 = parcel.readLong();
                iac.d(parcel);
                initializeWithElapsedTime(y55VarG14, jccVar2, j35, j36);
                break;
            case 61:
                long j37 = parcel.readLong();
                long j38 = parcel.readLong();
                iac.d(parcel);
                resetAnalyticsDataWithElapsedTime(j37, j38);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
