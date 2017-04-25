

const <%= ExportProjectName %> = {
  create(options, callbackID) {

  }
};


var meta = {
 <%= ExportProjectName %>: [{
    name: 'create',
    args: ['object', 'string']
  }]
};


if(window.Vue) {
  jud.registerModule('<%= ExportProjectName %>', <%= ExportProjectName %>);
}

function init(jud) {
  jud.registerApiModule('<%= ExportProjectName %>', <%= ExportProjectName %>, meta);
}

module.exports = {
  init:init
};
