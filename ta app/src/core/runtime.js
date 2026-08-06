(function installToolkitRuntime(global) {
    'use strict';

    if (global.GTTAHiringToolkit) return;

    const features = [];
    let started = false;

    const utils = Object.freeze({
        clean(value) {
            return String(value || '').replace(/\s+/g, ' ').trim();
        },
        normalize(value) {
            return utils.clean(value)
                .toLowerCase()
                .normalize('NFD')
                .replace(/[\u0300-\u036f]/g, '');
        },
        escapeHtml(value) {
            return String(value ?? '').replace(/[&<>"']/g, character => ({
                '&': '&amp;',
                '<': '&lt;',
                '>': '&gt;',
                '"': '&quot;',
                "'": '&#39;'
            })[character]);
        },
        escapeAttribute(value) {
            return utils.escapeHtml(value);
        }
    });

    global.GTTAHiringToolkit = Object.freeze({
        register(feature) {
            if (started) {
                throw new Error(`Cannot register feature after startup: ${feature?.id}`);
            }
            if (!feature?.id || typeof feature.init !== 'function') {
                throw new TypeError('A toolkit feature requires an id and init function.');
            }
            if (features.some(candidate => candidate.id === feature.id)) {
                throw new Error(`Duplicate toolkit feature id: ${feature.id}`);
            }
            features.push(Object.freeze({ ...feature }));
        },

        start() {
            if (started) return;
            started = true;

            features.forEach(feature => {
                try {
                    feature.init();
                } catch (error) {
                    console.error(`[GT TA Toolkit] ${feature.name || feature.id} failed`, error);
                }
            });
        },

        getFeatures() {
            return features.map(({ id, name }) => ({ id, name }));
        },

        utils
    });
})(window);
