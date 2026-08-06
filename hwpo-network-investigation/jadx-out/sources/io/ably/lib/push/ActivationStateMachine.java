package io.ably.lib.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.intercom.twig.BuildConfig;
import defpackage.aa;
import defpackage.aa0;
import defpackage.av;
import defpackage.ct1;
import defpackage.d55;
import defpackage.hc6;
import io.ably.lib.http.Http;
import io.ably.lib.http.HttpCore;
import io.ably.lib.http.HttpScheduler;
import io.ably.lib.http.HttpUtils;
import io.ably.lib.realtime.Presence;
import io.ably.lib.rest.AblyRest;
import io.ably.lib.rest.DeviceDetails;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.Param;
import io.ably.lib.types.RegistrationToken;
import io.ably.lib.util.IntentUtils;
import io.ably.lib.util.Log;
import io.ably.lib.util.ParamsUtils;
import io.ably.lib.util.Serialisation;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivationStateMachine {
    private static final String TAG = "AblyActivation";
    protected final ActivationContext activationContext;
    private final Context context;
    public State current;
    protected boolean handlingEvent;
    public ArrayDeque<Event> pendingEvents;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class AfterRegistrationSyncFailed extends PersistentState {
        public static final String NAME = "AfterRegistrationSyncFailed";

        public AfterRegistrationSyncFailed(ActivationStateMachine activationStateMachine) {
            super(activationStateMachine);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.PersistentState
        public String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }

        @Override // io.ably.lib.push.ActivationStateMachine.State
        public State transition(Event event) {
            if ((event instanceof CalledActivate) || (event instanceof GotPushDeviceDetails)) {
                this.machine.validateRegistration();
                return new WaitingForRegistrationSync(this.machine, event);
            }
            if (!(event instanceof CalledDeactivate)) {
                return null;
            }
            this.machine.deregister();
            return new WaitingForDeregistration(this.machine, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class CalledActivate extends Event {
        public static final String NAME = "CalledActivate";

        public static CalledActivate useCustomRegistrar(boolean z, SharedPreferences sharedPreferences) {
            sharedPreferences.edit().putBoolean("ABLY_PUSH_REGISTRATION_HANDLER", z).apply();
            return new CalledActivate();
        }

        @Override // io.ably.lib.push.ActivationStateMachine.Event
        public String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class CalledDeactivate extends Event {
        public static final String NAME = "CalledDeactivate";

        public static CalledDeactivate useCustomRegistrar(boolean z, SharedPreferences sharedPreferences) {
            sharedPreferences.edit().putBoolean("ABLY_PUSH_REGISTRATION_HANDLER", z).apply();
            return new CalledDeactivate();
        }

        @Override // io.ably.lib.push.ActivationStateMachine.Event
        public String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class Deregistered extends Event {
        public static final String NAME = "Deregistered";

        @Override // io.ably.lib.push.ActivationStateMachine.Event
        public String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class DeregistrationFailed extends ErrorEvent {
        public DeregistrationFailed(ErrorInfo errorInfo) {
            super(errorInfo);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.ErrorEvent
        public String toString() {
            return "DeregistrationFailed: " + super.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class ErrorEvent extends Event {
        public final ErrorInfo reason;

        public ErrorEvent(ErrorInfo errorInfo) {
            this.reason = errorInfo;
        }

        public String toString() {
            return "ErrorEvent{reason=" + this.reason + '}';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class Event {
        public static Event constructEventByName(String str) {
            str.getClass();
            switch (str) {
                case "RegistrationSynced":
                    return new RegistrationSynced();
                case "CalledDeactivate":
                    return new CalledDeactivate();
                case "GotPushDeviceDetails":
                    return new GotPushDeviceDetails();
                case "Deregistered":
                    return new Deregistered();
                case "CalledActivate":
                    return new CalledActivate();
                default:
                    return null;
            }
        }

        public String getPersistedName() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class GettingDeviceRegistrationFailed extends ErrorEvent {
        public GettingDeviceRegistrationFailed(ErrorInfo errorInfo) {
            super(errorInfo);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.ErrorEvent
        public String toString() {
            return "GettingDeviceRegistrationFailed: " + super.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class GettingPushDeviceDetailsFailed extends ErrorEvent {
        public GettingPushDeviceDetailsFailed(ErrorInfo errorInfo) {
            super(errorInfo);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.ErrorEvent
        public String toString() {
            return "GettingPushDeviceDetailsFailed: " + super.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class GotDeviceRegistration extends Event {
        final String deviceId;
        final String deviceIdentityToken;

        public GotDeviceRegistration(String str, String str2) {
            this.deviceId = str;
            this.deviceIdentityToken = str2;
        }

        public String toString() {
            return av.a(new StringBuilder("GotDeviceRegistration{deviceIdentityToken='"), this.deviceIdentityToken, "'}");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class GotPushDeviceDetails extends Event {
        public static final String NAME = "GotPushDeviceDetails";

        @Override // io.ably.lib.push.ActivationStateMachine.Event
        public String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class NotActivated extends PersistentState {
        public static final String NAME = "NotActivated";

        public NotActivated(ActivationStateMachine activationStateMachine) {
            super(activationStateMachine);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.PersistentState
        public String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }

        @Override // io.ably.lib.push.ActivationStateMachine.State
        public State transition(Event event) {
            if (event instanceof CalledDeactivate) {
                LocalDevice device = this.machine.getDevice();
                if (device.isRegistered()) {
                    this.machine.deregister();
                    return new WaitingForDeregistration(this.machine, this);
                }
                device.reset();
                this.machine.callDeactivatedCallback(null);
                return this;
            }
            if (!(event instanceof CalledActivate)) {
                if (event instanceof GotPushDeviceDetails) {
                    return this;
                }
                return null;
            }
            LocalDevice device2 = this.machine.getDevice();
            if (device2.isRegistered()) {
                this.machine.validateRegistration();
                return new WaitingForRegistrationSync(this.machine, event);
            }
            RegistrationToken registrationToken = device2.getRegistrationToken();
            ActivationStateMachine activationStateMachine = this.machine;
            if (registrationToken != null) {
                activationStateMachine.pendingEvents.add(new GotPushDeviceDetails());
            } else {
                activationStateMachine.getRegistrationToken();
            }
            if (!device2.isCreated()) {
                device2.create();
            }
            return new WaitingForPushDeviceDetails(this.machine);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class PersistKeys {
        public static final String CURRENT_STATE = "ABLY_PUSH_CURRENT_STATE";
        static final String PENDING_EVENTS_LENGTH = "ABLY_PUSH_PENDING_EVENTS_LENGTH";
        static final String PENDING_EVENTS_PREFIX = "ABLY_PUSH_PENDING_EVENTS";
        static final String PUSH_CUSTOM_REGISTRAR = "ABLY_PUSH_REGISTRATION_HANDLER";
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class PersistentState extends State {
        public PersistentState(ActivationStateMachine activationStateMachine) {
            super(activationStateMachine);
        }

        public static State constructStateByName(String str, ActivationStateMachine activationStateMachine) {
            str.getClass();
            switch (str) {
                case "WaitingForNewPushDeviceDetails":
                    return new WaitingForNewPushDeviceDetails(activationStateMachine);
                case "WaitingForPushDeviceDetails":
                    return new WaitingForPushDeviceDetails(activationStateMachine);
                case "AfterRegistrationSyncFailed":
                    return new AfterRegistrationSyncFailed(activationStateMachine);
                case "NotActivated":
                    return new NotActivated(activationStateMachine);
                default:
                    return null;
            }
        }

        public abstract String getPersistedName();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class RegistrationSynced extends Event {
        public static final String NAME = "RegistrationSynced";

        @Override // io.ably.lib.push.ActivationStateMachine.Event
        public String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class State {
        protected final ActivationStateMachine machine;

        public State(ActivationStateMachine activationStateMachine) {
            this.machine = activationStateMachine;
        }

        public abstract State transition(Event event);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class SyncRegistrationFailed extends ErrorEvent {
        public SyncRegistrationFailed(ErrorInfo errorInfo) {
            super(errorInfo);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.ErrorEvent
        public String toString() {
            return "SyncRegistrationFailed: " + super.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class WaitingForDeregistration extends State {
        private State previousState;

        public WaitingForDeregistration(ActivationStateMachine activationStateMachine, State state) {
            super(activationStateMachine);
            this.previousState = state;
        }

        public String toString() {
            return "WaitingForDeregistration{previousState=" + this.previousState + '}';
        }

        @Override // io.ably.lib.push.ActivationStateMachine.State
        public State transition(Event event) {
            if (event instanceof CalledDeactivate) {
                return this;
            }
            if (event instanceof Deregistered) {
                this.machine.getDevice().reset();
                this.machine.callDeactivatedCallback(null);
                return new NotActivated(this.machine);
            }
            if (!(event instanceof DeregistrationFailed)) {
                return null;
            }
            this.machine.callDeactivatedCallback(((DeregistrationFailed) event).reason);
            return this.previousState;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class WaitingForDeviceRegistration extends State {
        public WaitingForDeviceRegistration(ActivationStateMachine activationStateMachine) {
            super(activationStateMachine);
        }

        public String toString() {
            return "WaitingForDeviceRegistration";
        }

        @Override // io.ably.lib.push.ActivationStateMachine.State
        public State transition(Event event) {
            if (event instanceof CalledActivate) {
                return this;
            }
            if (!(event instanceof GotDeviceRegistration)) {
                if (!(event instanceof GettingDeviceRegistrationFailed)) {
                    return null;
                }
                this.machine.callActivatedCallback(((GettingDeviceRegistrationFailed) event).reason);
                return new NotActivated(this.machine);
            }
            LocalDevice device = this.machine.getDevice();
            GotDeviceRegistration gotDeviceRegistration = (GotDeviceRegistration) event;
            if (device.id.equals(gotDeviceRegistration.deviceId)) {
                device.setDeviceIdentityToken(gotDeviceRegistration.deviceIdentityToken);
                this.machine.callActivatedCallback(null);
                return new WaitingForNewPushDeviceDetails(this.machine);
            }
            Log.e(ActivationStateMachine.TAG, "error registering " + device.id + ": deviceId has been changed during registration, it was " + gotDeviceRegistration.deviceId);
            aa0.c("DeviceId has been changed during registration");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class WaitingForNewPushDeviceDetails extends PersistentState {
        public static final String NAME = "WaitingForNewPushDeviceDetails";

        public WaitingForNewPushDeviceDetails(ActivationStateMachine activationStateMachine) {
            super(activationStateMachine);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.PersistentState
        public String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }

        @Override // io.ably.lib.push.ActivationStateMachine.State
        public State transition(Event event) {
            if (event instanceof CalledActivate) {
                this.machine.callActivatedCallback(null);
                return this;
            }
            if (event instanceof CalledDeactivate) {
                this.machine.deregister();
                return new WaitingForDeregistration(this.machine, this);
            }
            if (!(event instanceof GotPushDeviceDetails)) {
                return null;
            }
            this.machine.getDevice();
            this.machine.updateRegistration();
            return new WaitingForRegistrationSync(this.machine, event);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class WaitingForPushDeviceDetails extends PersistentState {
        public static final String NAME = "WaitingForPushDeviceDetails";

        public WaitingForPushDeviceDetails(ActivationStateMachine activationStateMachine) {
            super(activationStateMachine);
        }

        @Override // io.ably.lib.push.ActivationStateMachine.PersistentState
        public String getPersistedName() {
            return NAME;
        }

        public String toString() {
            return NAME;
        }

        @Override // io.ably.lib.push.ActivationStateMachine.State
        public State transition(Event event) {
            if (event instanceof CalledActivate) {
                return this;
            }
            if (event instanceof CalledDeactivate) {
                this.machine.callDeactivatedCallback(null);
                return new NotActivated(this.machine);
            }
            if (event instanceof GettingPushDeviceDetailsFailed) {
                this.machine.callDeactivatedCallback(((GettingPushDeviceDetailsFailed) event).reason);
                return new NotActivated(this.machine);
            }
            if (!(event instanceof GotPushDeviceDetails)) {
                return null;
            }
            final ActivationContext activationContext = this.machine.activationContext;
            final LocalDevice localDevice = activationContext.getLocalDevice();
            if (activationContext.getPreferences().getBoolean("ABLY_PUSH_REGISTRATION_HANDLER", false)) {
                this.machine.invokeCustomRegistration(localDevice, true);
            } else {
                try {
                    final AblyRest ably = activationContext.getAbly();
                    final HttpCore.RequestBody requestBodyRequestBodyFromGson = HttpUtils.requestBodyFromGson(localDevice.toJsonObject(), ably.options.useBinaryProtocol);
                    ably.http.request(new Http.Execute<JsonObject>() { // from class: io.ably.lib.push.ActivationStateMachine.WaitingForPushDeviceDetails.2
                        @Override // io.ably.lib.http.Http.Execute
                        public void execute(HttpScheduler httpScheduler, Callback<JsonObject> callback) {
                            httpScheduler.post("/push/deviceRegistrations", HttpUtils.defaultAcceptHeaders(ably.options.useBinaryProtocol), ParamsUtils.enrichParams(null, ably.options), requestBodyRequestBodyFromGson, new Serialisation.HttpResponseHandler(), true, callback);
                        }
                    }).async(new Callback<JsonObject>() { // from class: io.ably.lib.push.ActivationStateMachine.WaitingForPushDeviceDetails.1
                        @Override // io.ably.lib.types.Callback
                        public void onError(ErrorInfo errorInfo) {
                            Log.e(ActivationStateMachine.TAG, "error registering " + localDevice.id + ": " + errorInfo.toString());
                            WaitingForPushDeviceDetails.this.machine.handleEvent(new GettingDeviceRegistrationFailed(errorInfo));
                        }

                        @Override // io.ably.lib.types.Callback
                        public void onSuccess(JsonObject jsonObject) {
                            Log.i(ActivationStateMachine.TAG, "registered " + localDevice.id);
                            JsonObject asJsonObject = jsonObject.getAsJsonObject("deviceIdentityToken");
                            if (asJsonObject == null) {
                                Log.e(ActivationStateMachine.TAG, "invalid device registration response (no deviceIdentityToken); deviceId = " + localDevice.id);
                                WaitingForPushDeviceDetails.this.machine.handleEvent(new GettingDeviceRegistrationFailed(new ErrorInfo("Invalid deviceIdentityToken in response", 40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS)));
                                return;
                            }
                            JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive(Presence.GET_CLIENTID);
                            if (asJsonPrimitive != null) {
                                String asString = asJsonPrimitive.getAsString();
                                if (localDevice.clientId == null) {
                                    activationContext.setClientId(asString, false);
                                }
                            }
                            WaitingForPushDeviceDetails.this.machine.handleEvent(new GotDeviceRegistration(localDevice.id, asJsonObject.getAsJsonPrimitive("token").getAsString()));
                        }
                    });
                } catch (AblyException e) {
                    ErrorInfo errorInfo = e.errorInfo;
                    Log.e(ActivationStateMachine.TAG, "exception registering " + localDevice.id + ": " + errorInfo.toString());
                    this.machine.handleEvent(new GettingDeviceRegistrationFailed(errorInfo));
                    return new NotActivated(this.machine);
                }
            }
            return new WaitingForDeviceRegistration(this.machine);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class WaitingForRegistrationSync extends State {
        private final Event fromEvent;

        public WaitingForRegistrationSync(ActivationStateMachine activationStateMachine, Event event) {
            super(activationStateMachine);
            this.fromEvent = event;
        }

        public String toString() {
            return "WaitingForRegistrationSync{fromEvent=" + this.fromEvent + '}';
        }

        @Override // io.ably.lib.push.ActivationStateMachine.State
        public State transition(Event event) {
            if (event instanceof CalledActivate) {
                if (this.fromEvent instanceof CalledActivate) {
                    return null;
                }
                this.machine.callActivatedCallback(null);
                return this;
            }
            if (event instanceof RegistrationSynced) {
                if (this.fromEvent instanceof CalledActivate) {
                    this.machine.callActivatedCallback(null);
                }
                return new WaitingForNewPushDeviceDetails(this.machine);
            }
            if (!(event instanceof SyncRegistrationFailed)) {
                return null;
            }
            ErrorInfo errorInfo = ((SyncRegistrationFailed) event).reason;
            boolean z = this.fromEvent instanceof CalledActivate;
            ActivationStateMachine activationStateMachine = this.machine;
            if (z) {
                activationStateMachine.callActivatedCallback(errorInfo);
            } else {
                activationStateMachine.callSyncRegistrationFailedCallback(errorInfo);
            }
            return new AfterRegistrationSyncFailed(this.machine);
        }
    }

    public ActivationStateMachine(ActivationContext activationContext) {
        this.activationContext = activationContext;
        this.context = activationContext.getContext();
        loadPersisted();
        this.handlingEvent = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callActivatedCallback(ErrorInfo errorInfo) {
        sendErrorIntent("PUSH_ACTIVATE", errorInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callDeactivatedCallback(ErrorInfo errorInfo) {
        sendErrorIntent("PUSH_DEACTIVATE", errorInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callSyncRegistrationFailedCallback(ErrorInfo errorInfo) {
        sendErrorIntent("PUSH_UPDATE_FAILED", errorInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deregister() {
        final LocalDevice localDevice = this.activationContext.getLocalDevice();
        if (this.activationContext.getPreferences().getBoolean("ABLY_PUSH_REGISTRATION_HANDLER", false)) {
            invokeCustomDeregistration(localDevice);
            return;
        }
        try {
            final AblyRest deviceIdentityTokenBasedAblyClient = this.activationContext.getDeviceIdentityTokenBasedAblyClient(localDevice.deviceIdentityToken);
            deviceIdentityTokenBasedAblyClient.http.request(new Http.Execute<Void>() { // from class: io.ably.lib.push.ActivationStateMachine.10
                @Override // io.ably.lib.http.Http.Execute
                public void execute(HttpScheduler httpScheduler, Callback<Void> callback) {
                    httpScheduler.del("/push/deviceRegistrations/" + localDevice.id, HttpUtils.mergeHeaders(HttpUtils.defaultAcceptHeaders(deviceIdentityTokenBasedAblyClient.options.useBinaryProtocol), localDevice.deviceIdentityHeaders()), ParamsUtils.enrichParams(new Param[0], deviceIdentityTokenBasedAblyClient.options), null, true, callback);
                }
            }).async(new Callback<Void>() { // from class: io.ably.lib.push.ActivationStateMachine.9
                @Override // io.ably.lib.types.Callback
                public void onError(ErrorInfo errorInfo) {
                    if (errorInfo.statusCode == 401 || errorInfo.code == 40005) {
                        Log.w(ActivationStateMachine.TAG, "unauthorized error during deregistration " + localDevice.id + ": " + errorInfo);
                        ActivationStateMachine.this.handleEvent(new Deregistered());
                        return;
                    }
                    Log.e(ActivationStateMachine.TAG, "error deregistering " + localDevice.id + ": " + errorInfo);
                    ActivationStateMachine.this.handleEvent(new DeregistrationFailed(errorInfo));
                }

                @Override // io.ably.lib.types.Callback
                public void onSuccess(Void r2) {
                    Log.i(ActivationStateMachine.TAG, "deregistered " + localDevice.id);
                    ActivationStateMachine.this.handleEvent(new Deregistered());
                }
            });
        } catch (AblyException e) {
            ErrorInfo errorInfo = e.errorInfo;
            Log.e(TAG, "exception registering " + localDevice.id + ": " + errorInfo.toString());
            handleEvent(new DeregistrationFailed(errorInfo));
        }
    }

    private void enqueueEvent(Event event) {
        Log.d(TAG, "enqueuing event: " + event);
        this.pendingEvents.add(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LocalDevice getDevice() {
        return this.activationContext.getLocalDevice();
    }

    private ArrayDeque<Event> getPersistedPendingEvents() {
        int i = this.activationContext.getPreferences().getInt("ABLY_PUSH_PENDING_EVENTS_LENGTH", 0);
        ArrayDeque<Event> arrayDeque = new ArrayDeque<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            SharedPreferences preferences = this.activationContext.getPreferences();
            Locale locale = Locale.ROOT;
            String string = preferences.getString("ABLY_PUSH_PENDING_EVENTS[" + i2 + "]", BuildConfig.FLAVOR);
            Event eventConstructEventByName = Event.constructEventByName(string);
            if (eventConstructEventByName != null) {
                arrayDeque.add(eventConstructEventByName);
            } else {
                Log.w(TAG, "Failed to construct push activation state machine event from persisted class name '" + string + "'.");
            }
        }
        return arrayDeque;
    }

    private State getPersistedState() {
        State stateConstructStateByName = PersistentState.constructStateByName(this.activationContext.getPreferences().getString(PersistKeys.CURRENT_STATE, BuildConfig.FLAVOR), this);
        return stateConstructStateByName == null ? new NotActivated(this) : stateConstructStateByName;
    }

    private void invokeCustomDeregistration(final DeviceDetails deviceDetails) {
        registerOnceReceiver("PUSH_DEVICE_DEREGISTERED", new BroadcastReceiver() { // from class: io.ably.lib.push.ActivationStateMachine.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                ErrorInfo errorInfo = IntentUtils.getErrorInfo(intent);
                DeviceDetails deviceDetails2 = deviceDetails;
                if (errorInfo == null) {
                    Log.i(ActivationStateMachine.TAG, "custom deregistration for " + deviceDetails2.id);
                    ActivationStateMachine.this.handleEvent(new Deregistered());
                    return;
                }
                Log.e(ActivationStateMachine.TAG, "error from custom deregisterer for " + deviceDetails2.id + ": " + errorInfo.toString());
                ActivationStateMachine.this.handleEvent(new DeregistrationFailed(errorInfo));
            }
        });
        sendIntent("PUSH_DEREGISTER_DEVICE", new Intent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeCustomRegistration(DeviceDetails deviceDetails, final boolean z) {
        final String str = deviceDetails.id;
        registerOnceReceiver("PUSH_DEVICE_REGISTERED", new BroadcastReceiver() { // from class: io.ably.lib.push.ActivationStateMachine.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                ErrorInfo errorInfo = IntentUtils.getErrorInfo(intent);
                String str2 = str;
                if (errorInfo == null) {
                    Log.i(ActivationStateMachine.TAG, "custom registration for " + str2);
                    boolean z2 = z;
                    ActivationStateMachine activationStateMachine = ActivationStateMachine.this;
                    if (z2) {
                        activationStateMachine.handleEvent(new GotDeviceRegistration(str, intent.getStringExtra("deviceIdentityToken")));
                        return;
                    } else {
                        activationStateMachine.handleEvent(new RegistrationSynced());
                        return;
                    }
                }
                StringBuilder sbA = aa.a("error from custom registration for ", str2, ": ");
                sbA.append(errorInfo.toString());
                Log.e(ActivationStateMachine.TAG, sbA.toString());
                boolean z3 = z;
                ActivationStateMachine activationStateMachine2 = ActivationStateMachine.this;
                if (z3) {
                    activationStateMachine2.handleEvent(new GettingDeviceRegistrationFailed(errorInfo));
                } else {
                    activationStateMachine2.handleEvent(new SyncRegistrationFailed(errorInfo));
                }
            }
        });
        Intent intent = new Intent();
        intent.putExtra("isNew", z);
        sendIntent("PUSH_REGISTER_DEVICE", intent);
    }

    private void loadPersisted() {
        this.current = getPersistedState();
        this.pendingEvents = getPersistedPendingEvents();
    }

    private boolean persist() {
        SharedPreferences.Editor editorEdit = this.activationContext.getPreferences().edit();
        State state = this.current;
        if (state instanceof PersistentState) {
            editorEdit.putString(PersistKeys.CURRENT_STATE, ((PersistentState) state).getPersistedName());
        }
        editorEdit.putInt("ABLY_PUSH_PENDING_EVENTS_LENGTH", this.pendingEvents.size());
        Iterator<Event> it = this.pendingEvents.iterator();
        int i = 0;
        while (it.hasNext()) {
            String persistedName = it.next().getPersistedName();
            if (persistedName != null) {
                Locale locale = Locale.ROOT;
                editorEdit.putString("ABLY_PUSH_PENDING_EVENTS[" + i + "]", persistedName);
            }
            i++;
        }
        return editorEdit.commit();
    }

    private void registerOnceReceiver(String str, final BroadcastReceiver broadcastReceiver) {
        BroadcastReceiver broadcastReceiver2 = new BroadcastReceiver() { // from class: io.ably.lib.push.ActivationStateMachine.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                hc6 hc6VarA = hc6.a(context.getApplicationContext());
                synchronized (hc6VarA.b) {
                    try {
                        ArrayList<hc6.c> arrayListRemove = hc6VarA.b.remove(this);
                        if (arrayListRemove != null) {
                            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                                hc6.c cVar = arrayListRemove.get(size);
                                cVar.d = true;
                                for (int i = 0; i < cVar.a.countActions(); i++) {
                                    String action = cVar.a.getAction(i);
                                    ArrayList<hc6.c> arrayList = hc6VarA.c.get(action);
                                    if (arrayList != null) {
                                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                            hc6.c cVar2 = arrayList.get(size2);
                                            if (cVar2.b == this) {
                                                cVar2.d = true;
                                                arrayList.remove(size2);
                                            }
                                        }
                                        if (arrayList.size() <= 0) {
                                            hc6VarA.c.remove(action);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                broadcastReceiver.onReceive(context, intent);
            }
        };
        IntentFilter intentFilter = new IntentFilter(ct1.a("io.ably.broadcast.", str));
        hc6 hc6VarA = hc6.a(this.context);
        synchronized (hc6VarA.b) {
            try {
                hc6.c cVar = new hc6.c(intentFilter, broadcastReceiver2);
                ArrayList<hc6.c> arrayList = hc6VarA.b.get(broadcastReceiver2);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    hc6VarA.b.put(broadcastReceiver2, arrayList);
                }
                arrayList.add(cVar);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList<hc6.c> arrayList2 = hc6VarA.c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        hc6VarA.c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void sendErrorIntent(String str, ErrorInfo errorInfo) {
        Intent intent = new Intent();
        IntentUtils.addErrorInfo(intent, errorInfo);
        sendIntent(str, intent);
    }

    private void sendIntent(String str, Intent intent) {
        String str2;
        intent.setAction("io.ably.broadcast." + str);
        hc6 hc6VarA = hc6.a(this.context);
        synchronized (hc6VarA.b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(hc6VarA.a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    android.util.Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<hc6.c> arrayList = hc6VarA.c.get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        android.util.Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i = 0;
                    while (i < arrayList.size()) {
                        hc6.c cVar = arrayList.get(i);
                        if (z) {
                            android.util.Log.v("LocalBroadcastManager", "Matching against filter " + cVar.a);
                        }
                        if (cVar.c) {
                            if (z) {
                                android.util.Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList;
                        } else {
                            int iMatch = cVar.a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z) {
                                    android.util.Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(cVar);
                                cVar.c = true;
                            } else {
                                arrayList = arrayList;
                                if (z) {
                                    if (iMatch == -4) {
                                        str2 = "category";
                                    } else if (iMatch == -3) {
                                        str2 = "action";
                                    } else if (iMatch != -2) {
                                        str2 = iMatch != -1 ? "unknown reason" : "type";
                                    } else {
                                        str2 = "data";
                                    }
                                    android.util.Log.v("LocalBroadcastManager", "  Filter did not match: " + str2);
                                }
                            }
                        }
                        i++;
                        arrayList = arrayList;
                    }
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            ((hc6.c) arrayList2.get(i2)).c = false;
                        }
                        hc6VarA.d.add(new hc6.b(intent, arrayList2));
                        if (!hc6VarA.e.hasMessages(1)) {
                            hc6VarA.e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRegistration() {
        final LocalDevice localDevice = this.activationContext.getLocalDevice();
        if (this.activationContext.getPreferences().getBoolean("ABLY_PUSH_REGISTRATION_HANDLER", false)) {
            invokeCustomRegistration(localDevice, false);
            return;
        }
        try {
            final AblyRest ably = this.activationContext.getAbly();
            final HttpCore.RequestBody requestBodyRequestBodyFromGson = HttpUtils.requestBodyFromGson(localDevice.pushRecipientJsonObject(), ably.options.useBinaryProtocol);
            ably.http.request(new Http.Execute<Void>() { // from class: io.ably.lib.push.ActivationStateMachine.6
                @Override // io.ably.lib.http.Http.Execute
                public void execute(HttpScheduler httpScheduler, Callback<Void> callback) {
                    httpScheduler.patch("/push/deviceRegistrations/" + localDevice.id, ably.push.pushRequestHeaders(true), ParamsUtils.enrichParams(null, ably.options), requestBodyRequestBodyFromGson, null, false, callback);
                }
            }).async(new Callback<Void>() { // from class: io.ably.lib.push.ActivationStateMachine.5
                @Override // io.ably.lib.types.Callback
                public void onError(ErrorInfo errorInfo) {
                    Log.e(ActivationStateMachine.TAG, "error updating registration " + localDevice.id + ": " + errorInfo.toString());
                    ActivationStateMachine.this.handleEvent(new SyncRegistrationFailed(errorInfo));
                }

                @Override // io.ably.lib.types.Callback
                public void onSuccess(Void r2) {
                    Log.i(ActivationStateMachine.TAG, "updated registration " + localDevice.id);
                    ActivationStateMachine.this.handleEvent(new RegistrationSynced());
                }
            });
        } catch (AblyException e) {
            ErrorInfo errorInfo = e.errorInfo;
            Log.e(TAG, "exception registering " + localDevice.id + ": " + errorInfo.toString());
            handleEvent(new SyncRegistrationFailed(errorInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void validateRegistration() {
        String str;
        final LocalDevice localDevice = this.activationContext.getLocalDevice();
        try {
            final AblyRest ably = this.activationContext.getAbly();
            String str2 = ably.auth.clientId;
            if (str2 != null && (str = localDevice.clientId) != null && !str2.equals(str)) {
                handleEvent(new SyncRegistrationFailed(new ErrorInfo("Activation failed: present clientId is not compatible with existing device registration", CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 61002)));
            } else if (this.activationContext.getPreferences().getBoolean("ABLY_PUSH_REGISTRATION_HANDLER", false)) {
                invokeCustomRegistration(localDevice, false);
            } else {
                ably.http.request(new Http.Execute<JsonObject>() { // from class: io.ably.lib.push.ActivationStateMachine.8
                    @Override // io.ably.lib.http.Http.Execute
                    public void execute(HttpScheduler httpScheduler, Callback<JsonObject> callback) {
                        httpScheduler.put("/push/deviceRegistrations/" + localDevice.id, ably.push.pushRequestHeaders(true), ParamsUtils.enrichParams(null, ably.options), HttpUtils.requestBodyFromGson(localDevice.toJsonObject(), ably.options.useBinaryProtocol), new Serialisation.HttpResponseHandler(), true, callback);
                    }
                }).async(new Callback<JsonObject>() { // from class: io.ably.lib.push.ActivationStateMachine.7
                    @Override // io.ably.lib.types.Callback
                    public void onError(ErrorInfo errorInfo) {
                        Log.e(ActivationStateMachine.TAG, "error validating registration " + localDevice.id + ": " + errorInfo.toString());
                        ActivationStateMachine.this.handleEvent(new SyncRegistrationFailed(errorInfo));
                    }

                    @Override // io.ably.lib.types.Callback
                    public void onSuccess(JsonObject jsonObject) {
                        Log.i(ActivationStateMachine.TAG, "updated registration " + localDevice.id);
                        JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive(Presence.GET_CLIENTID);
                        if (asJsonPrimitive != null) {
                            String asString = asJsonPrimitive.getAsString();
                            if (localDevice.clientId == null) {
                                ActivationStateMachine.this.activationContext.setClientId(asString, false);
                            }
                        }
                        ActivationStateMachine.this.handleEvent(new RegistrationSynced());
                    }
                });
            }
        } catch (AblyException e) {
            ErrorInfo errorInfo = e.errorInfo;
            Log.e(TAG, "exception validating registration for " + localDevice.id + ": " + errorInfo.toString());
            handleEvent(new SyncRegistrationFailed(errorInfo));
        }
    }

    public void getRegistrationToken() {
        this.activationContext.getRegistrationToken(new Callback<String>() { // from class: io.ably.lib.push.ActivationStateMachine.4
            @Override // io.ably.lib.types.Callback
            public void onError(ErrorInfo errorInfo) {
                Log.e(ActivationStateMachine.TAG, "getInstanceId failed", AblyException.fromErrorInfo(errorInfo));
                ActivationStateMachine.this.handleEvent(new GettingPushDeviceDetailsFailed(errorInfo));
            }

            @Override // io.ably.lib.types.Callback
            public void onSuccess(String str) {
                Log.i(ActivationStateMachine.TAG, "getInstanceId completed with new token");
                ActivationStateMachine.this.activationContext.onNewRegistrationToken(RegistrationToken.Type.FCM, str);
            }
        });
    }

    public synchronized boolean handleEvent(Event event) {
        if (this.handlingEvent) {
            enqueueEvent(event);
            return true;
        }
        this.handlingEvent = true;
        try {
            Log.d(TAG, "handling event " + event + " from state " + this.current);
            State stateTransition = this.current.transition(event);
            if (stateTransition == null) {
                enqueueEvent(event);
                boolean zPersist = persist();
                this.handlingEvent = false;
                return zPersist;
            }
            Log.d(TAG, "transition: " + this.current + " -(" + event + ")-> " + stateTransition + ".");
            this.current = stateTransition;
            while (true) {
                Event eventPeek = this.pendingEvents.peek();
                if (eventPeek == null) {
                    break;
                }
                Log.d(TAG, "attempting to consume pending event: " + eventPeek);
                State stateTransition2 = this.current.transition(eventPeek);
                if (stateTransition2 == null) {
                    break;
                }
                this.pendingEvents.poll();
                Log.d(TAG, "transition: " + this.current + " -(" + eventPeek + ")-> " + stateTransition2 + ".");
                this.current = stateTransition2;
            }
            boolean zPersist2 = persist();
            this.handlingEvent = false;
            return zPersist2;
        } catch (Throwable th) {
            this.handlingEvent = false;
            throw th;
        }
    }

    public boolean reset() {
        SharedPreferences.Editor editorEdit = this.activationContext.getPreferences().edit();
        for (Field field : PersistKeys.class.getDeclaredFields()) {
            try {
                editorEdit.remove((String) field.get(null));
            } catch (IllegalAccessException e) {
                d55.a(e);
                return false;
            }
        }
        try {
            return editorEdit.commit();
        } finally {
            loadPersisted();
        }
    }
}
