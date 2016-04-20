$(document).ready(function() {
    $('#Ingresar1').bootstrapValidator({
    	 feedbackIcons: {
    		 valid: 'glyphicon glyphicon-ok',
    		 invalid: 'glyphicon glyphicon-remove',
    		 validating: 'glyphicon glyphicon-refresh'
    	 },
    	 fields: {
    		 nombre: {
    			 validators: {
    				 notEmpty: {
    					 message: 'El nombre es requerido'
    				 },
                     stringLength: {
                         max: 100,
                         message: 'El nombre debe contener maximo 100 caracteres'
                     }
    			 }
    		 },
    		 apellido: {
    			 validators: {
    				 notEmpty: {
    					 message: 'El apellido es requerido'
    				 },
                     stringLength: {
                         max: 100,
                         message: 'El apellido debe contener maximo 100 caracteres'
                     }
    			 }
    		 },
    		 mail: {
                 validators: {
                     notEmpty: {
                         message: 'El correo es requerido y no puede ser vacio'
                     },
                     emailAddress: {
                         message: 'El correo electronico no es valido'
                     },
                     stringLength: {
                         max: 50,
                         message: 'El mail debe contener maximo 50 caracteres'
                     }
                 }   
             },
             telefono: {
                 validators: {
                     notEmpty: {
                         message: 'El telefono es requerido'
                     },
                     stringLength: {
                         max: 20,
                         message: 'El telefono debe contener maximo 20 caracteres'
                     },
                     regexp: {
                         regexp: /^[0-9]+$/,
                         message: 'El teléfono solo puede contener números'
                     }
                 }
             },             
    	 }
    });

    $('#ServletActualizar').bootstrapValidator({
         feedbackIcons: {
             valid: 'glyphicon glyphicon-ok',
             invalid: 'glyphicon glyphicon-remove',
             validating: 'glyphicon glyphicon-refresh'
         },
         fields: {
             id: {
                 validators: {
                     notEmpty: {
                         message: 'El id es requerido'
                     },
                     stringLength: {
                         max: 20,
                         message: 'El id debe contener maximo 10 caracteres'
                     },
                     regexp: {
                         regexp: /^[0-9]+$/,
                         message: 'El id solo puede contener números'
                     }
                 }
             },
             nombre: {
                 validators: {
                     notEmpty: {
                         message: 'El nombre es requerido'
                     },
                     stringLength: {
                         max: 100,
                         message: 'El nombre debe contener maximo 100 caracteres'
                     }
                 }
             },
             apellido: {
                 validators: {
                     notEmpty: {
                         message: 'El apellido es requerido'
                     },
                     stringLength: {
                         max: 100,
                         message: 'El apellido debe contener maximo 100 caracteres'
                     }
                 }
             },
             mail: {
                 validators: {
                     notEmpty: {
                         message: 'El correo es requerido y no puede ser vacio'
                     },
                     emailAddress: {
                         message: 'El correo electronico no es valido'
                     },
                     stringLength: {
                         max: 50,
                         message: 'El mail debe contener maximo 50 caracteres'
                     }
                 }   
             },
             telefono: {
                 validators: {
                     notEmpty: {
                         message: 'El telefono es requerido'
                     },
                     stringLength: {
                         max: 20,
                         message: 'El telefono debe contener maximo 20 caracteres'
                     },
                     regexp: {
                         regexp: /^[0-9]+$/,
                         message: 'El teléfono solo puede contener números'
                     }
                 }
             },
             
         }
    });

    $('#ServletEliminar').bootstrapValidator({
         feedbackIcons: {
             valid: 'glyphicon glyphicon-ok',
             invalid: 'glyphicon glyphicon-remove',
             validating: 'glyphicon glyphicon-refresh'
         },
         fields: {
        	 nombre: {
                 validators: {
                     notEmpty: {
                         message: 'El nombre es requerido'
                     },
                     stringLength: {
                         max: 100,
                         message: 'El nombre debe contener maximo 100 caracteres'
                     }
                 }
             },
             apellido: {
                 validators: {
                     notEmpty: {
                         message: 'El apellido es requerido'
                     },
                     stringLength: {
                         max: 100,
                         message: 'El apellido debe contener maximo 100 caracteres'
                     }
                 }
             }
         }
    });
});